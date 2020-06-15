// Posted from EduTools plugin
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberSequence = new ArrayList<>();
        int check = 0;

        while (true) {
            check = scanner.nextInt();
            if (check == 0) {
                break;
            } else {
                numberSequence.add(check);
            }
        }

        int result = 0;
        ArrayList<Integer> copyOfNumberSequence = new ArrayList<>(numberSequence);
        Collections.sort(copyOfNumberSequence);

        result = numberSequence.equals(copyOfNumberSequence) ? result + 1 : result;
        copyOfNumberSequence.sort(Collections.reverseOrder());

        result = numberSequence.equals(copyOfNumberSequence) ? result + 1 : result;

        if (result >= 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}