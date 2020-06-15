// Posted from EduTools plugin
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String halfOne = str.substring(0, str.length() / 2);
        String halfTwo = str.substring(str.length() / 2);
        long sumOne = 0;
        long sumTwo = 0;

        for (int i = 0; i < halfOne.length(); i++) {
            sumOne += Long.parseLong(String.valueOf(halfOne.charAt(i)));
        }

        for (int i = 0; i < halfTwo.length(); i++) {
            sumTwo += Long.parseLong(String.valueOf(halfTwo.charAt(i)));
        }

        if (sumOne == sumTwo) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}