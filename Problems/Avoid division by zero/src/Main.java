// Posted from EduTools plugin

import java.util.Scanner;

class FixingArithmeticException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(d == 0 || (b + c) / d == 0 ? "Division by zero!" : a / ((b + c) / d));
    }
}