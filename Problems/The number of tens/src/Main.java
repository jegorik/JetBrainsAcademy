import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        scanner.close();
        System.out.println(number.length() > 1 ? number.charAt(number.length() - 2) : "0");
    }
}