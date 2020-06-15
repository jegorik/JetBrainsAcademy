// Posted from EduTools plugin
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[2];
        int firstNumber = scanner.nextInt();
        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        scanner.close();
        Arrays.sort(numbers);

        System.out.println(firstNumber >= numbers[0] && firstNumber <= numbers[1]);
    }
}