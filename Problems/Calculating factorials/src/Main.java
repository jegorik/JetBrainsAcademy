// Posted from EduTools plugin
import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        long sum = 1;
        for (int i = 1; i < n + 1; i++) {
            sum *= i;
        }
        return sum;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}