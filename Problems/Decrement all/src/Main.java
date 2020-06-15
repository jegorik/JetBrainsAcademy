// Posted from EduTools plugin
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Integer[] result = new Integer[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            result[i] = Integer.parseInt(scanner.next()) - 1;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}