// Posted from EduTools plugin
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            array.add(Integer.parseInt(scanner.next()));
        }

        if (!array.get(0).equals(array.get(1)) && !array.get(1).equals(array.get(2)) && !array.get(0).equals(array.get(2))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}