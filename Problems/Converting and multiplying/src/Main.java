import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String line = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                line = scanner.nextLine();
                int num = Integer.parseInt(line);
                if (num == 0) {
                    break;
                } else {
                    System.out.println(num * 10);
                }
            } catch (Exception e) {
                System.out.println("Invalid user input: " + line);
            }
        }
    }
}