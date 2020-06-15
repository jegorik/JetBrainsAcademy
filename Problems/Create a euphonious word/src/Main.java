// Posted from EduTools plugin
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y'));
        ArrayList<Character> consonants = new ArrayList<>(Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'));
        int result = 0;
        int vowCount = 0;
        int conCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(str.charAt(i))) {
                vowCount++;
                conCount = 0;
                if (vowCount >= 3 && vowCount % 2 != 0) {
                    result++;
                }
            } else if (consonants.contains(str.charAt(i))) {
                conCount++;
                vowCount = 0;
                if (conCount >= 3 && conCount % 2 != 0) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}