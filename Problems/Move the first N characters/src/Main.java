// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int value = scanner.nextInt();

        if (value < str.length()) {
            System.out.println(str.substring(value) + str.substring(0, value));
        } else {
            System.out.println(str);
        }
    }
}