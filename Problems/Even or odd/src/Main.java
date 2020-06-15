// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int check;

        while (true) {
            check = scanner.nextInt();
            if (check == 0) {
                break;
            } else {
                System.out.println(check % 2 == 0 ? "even" : "odd");
            }
        }
    }
}