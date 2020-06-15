// Posted from EduTools plugin
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        for (int i = 0; i < 3; i++) {
            if (Integer.parseInt(scanner.next()) > 0) {
                result++;
            }
        }

        if (result == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}