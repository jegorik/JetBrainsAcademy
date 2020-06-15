// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.parseInt(scanner.next());

        if (value < 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}