// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.next());

        for (int i = 1; i <= number; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                System.out.println(i);
            }
        }
    }
}