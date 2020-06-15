// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int value = Integer.parseInt(new Scanner(System.in).next());

        if (value > 0 && value <= 19) {
            System.out.println("pack");
        } else if (value > 19 && value <= 249) {
            System.out.println("throng");
        } else if (value > 249 && value <= 999) {
            System.out.println("zounds");
        } else if (value >= 1000) {
            System.out.println("legion");
        } else {
            System.out.println("no army");
        }
    }
}