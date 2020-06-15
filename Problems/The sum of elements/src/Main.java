// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int value = Integer.parseInt(scanner.next());
            if (value == 0) {
                break;
            } else {
                sum += value;
            }
        }
        System.out.println(sum);
    }
}