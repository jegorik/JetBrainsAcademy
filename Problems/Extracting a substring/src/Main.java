// Posted from EduTools plugin
import com.sun.source.tree.IfTree;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            array.add(scanner.next());
        }

        System.out.println(array.get(0).substring(Integer.parseInt(array.get(1)), Integer.parseInt(array.get(2)) + 1));
    }
}