import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check = -1;
        int count = 0;

        while (true) {
            check = sc.nextInt();
            if (check == 0) {
                break;
            } else {
                count = check > 0 ? count + 1 : count;
            }
        }
        System.out.println(count);
    }
}