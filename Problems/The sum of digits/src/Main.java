// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        scanner.close();
        int sum = 0;
        for (sum = 0; digit != 0; digit /= 10) {
            sum += digit % 10;
        }
        System.out.println(sum);
    }
}