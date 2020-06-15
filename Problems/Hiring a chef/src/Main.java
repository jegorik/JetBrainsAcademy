// Posted from EduTools plugin
//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] info = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            info[i] = scanner.next();
        }
        System.out.println("The form for " + info[0] + " is completed");
    }
}