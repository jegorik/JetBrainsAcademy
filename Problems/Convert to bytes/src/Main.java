// Posted from EduTools plugin
import java.io.BufferedReader;
import java.io.InputStreamReader;


class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            result.append((byte) line.charAt(i));
        }

        System.out.println(result);
    }
}