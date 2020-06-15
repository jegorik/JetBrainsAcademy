// Posted from EduTools plugin
//put imports you need here

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            countries.add(scanner.next());
        }

        System.out.println(countries.get(2));
        System.out.println(countries.get(0));
        System.out.println(countries.get(5) + " " + countries.get(6));
        System.out.println(countries.get(7) + " " + countries.get(8));
        System.out.println(countries.get(1));
        System.out.println(countries.get(4));
        System.out.println(countries.get(3));
    }
}