// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int m = Integer.parseInt(scanner.next());
        int k = Integer.parseInt(scanner.next());

        if ((k % n == 0 || k % m == 0) && (k < (n * m))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}