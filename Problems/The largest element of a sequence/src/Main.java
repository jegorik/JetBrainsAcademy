// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;

        while (true) {
            int check = scanner.nextInt();
            if (check == 0) {
                break;
            } else {
                max = Math.max(check, max);
            }
        }

        System.out.println(max);
    }
}