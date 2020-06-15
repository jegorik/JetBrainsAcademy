// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = Integer.parseInt(scanner.next());
        Integer b = Integer.parseInt(scanner.next());
        Integer h = Integer.parseInt(scanner.next());

        if (h >= a && h <= b) {
            System.out.println("Normal");
        } else if (h > a && h > b) {
            System.out.println("Excess");
        } else {
            System.out.println("Deficiency");
        }
    }
}