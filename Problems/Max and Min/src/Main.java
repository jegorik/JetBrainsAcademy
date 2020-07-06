import java.util.Arrays;
import java.util.Scanner;

class Finder {

    private FindingStrategy strategy;

    public Finder(FindingStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * It performs the search algorithm according to the given strategy
     */
    public int find(int[] numbers) {
        return strategy.getResult(numbers.clone());
    }
}

interface FindingStrategy {

    /**
     * Returns search result
     */
    int getResult(int[] numbers);

}

class MaxFindingStrategy implements FindingStrategy, ArraySorting {

    public int getResult(int[] numbers) {
        return arrayIsEmpty(numbers) ? Integer.MIN_VALUE : arraySort(numbers, "MAX");
    }
}

class MinFindingStrategy implements FindingStrategy, ArraySorting {

    public int getResult(int[] numbers) {
        return arrayIsEmpty(numbers) ? Integer.MAX_VALUE : arraySort(numbers, "MIN");
    }
}


interface ArraySorting {

    default boolean arrayIsEmpty(int[] numbers) {
        return numbers == null || numbers.length == 0;
    }

    default int arraySort(int[] numbers, String pos) {
        Arrays.sort(numbers);
        int result = numbers[0];
        if (pos.equals("MAX") && numbers.length > 1) {
            result = numbers[numbers.length - 1];
        }
        return result;
    }
}

/* Do not change code below */
public class Main {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final String[] elements = scanner.nextLine().split("\\s+");
        int[] numbers = null;

        if (elements[0].equals("EMPTY")) {
            numbers = new int[0];
        } else {
            numbers = new int[elements.length];
            for (int i = 0; i < elements.length; i++) {
                numbers[i] = Integer.parseInt(elements[i]);
            }
        }

        final String type = scanner.nextLine();

        Finder finder = null;

        switch (type) {
            case "MIN":
                finder = new Finder(new MinFindingStrategy());
                break;
            case "MAX":
                finder = new Finder(new MaxFindingStrategy());
                break;
            default:
                break;
        }

        if (finder == null) {
            throw new RuntimeException(
                    "Unknown strategy type passed. Please, write to the author of the problem.");
        }

        System.out.println(finder.find(numbers));
    }
}
