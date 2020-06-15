// Posted from EduTools plugin
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int value = Integer.parseInt(scanner.next());

        array.add(value);

        while (true) {
            if (value == 1) {
                break;
            } else {
                if (value % 2 == 0) {
                    value = value / 2;
                } else {
                    value = (value * 3) + 1;
                }
                array.add(value);
            }
        }

        for (Integer number : array) {
            System.out.print(number + " ");
        }
    }
}