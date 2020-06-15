// Posted from EduTools plugin
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int fault = 0;

        for (int i = 0; i < numberOfBridges; i++) {
            if (fault == 0) {
                if (scanner.nextInt() <= busHeight) {
                    fault = i + 1;
                }
            }
        }

        System.out.println(fault == 0 ? "Will not crash" : "Will crash on bridge " + fault);
    }
}