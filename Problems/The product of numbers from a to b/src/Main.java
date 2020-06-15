// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        long result = 1;

        for (int i = a; i < b; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}