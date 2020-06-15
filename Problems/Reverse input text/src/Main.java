// Posted from EduTools plugin
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            for (int i = line.length() - 1; i > -1; i--) {
                System.out.print(line.charAt(i));
            }
        }
    }
}