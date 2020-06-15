// Posted from EduTools plugin
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<String> words;
            String line = reader.readLine();
            reader.close();
            words = Arrays.asList(line.split(" "));

            int count = 0;
            for (String value : words) {
                count = value.trim().equals("") ? count : count + 1;
            }
            System.out.println(count);
        }
    }
}