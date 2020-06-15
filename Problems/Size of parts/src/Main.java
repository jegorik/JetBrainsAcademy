// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int partsQuantity = Integer.parseInt(scanner.next());
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        for (int i = 0; i < partsQuantity; i++) {
            int part = Integer.parseInt(scanner.next());
            switch (part) {
                case (0):
                    perfect++;
                    break;
                case (-1):
                    smaller++;
                    break;
                case (1):
                    larger++;
                    break;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}