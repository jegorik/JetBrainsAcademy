// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.next().toCharArray();
        StringBuilder result = new StringBuilder();

        for (Character value : chars) {
            result.append(value).append(value);
        }
        System.out.println(result);
    }
}