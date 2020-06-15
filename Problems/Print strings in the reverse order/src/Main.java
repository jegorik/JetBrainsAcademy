// Posted from EduTools plugin
//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[3];

        for (int i = 0; i < 3; i++) {
            String word = scanner.next();
            array[i] = word;
        }

        for (int i = array.length - 1; i > -1; i--) {
            System.out.println(array[i]);
        }
    }
}