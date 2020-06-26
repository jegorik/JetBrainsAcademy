import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.nextLine());
        BufferedReader reader = null;

        ArrayList<String> years = new ArrayList<>();
        ArrayList<Long> values = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;
            while ((text = reader.readLine()) != null) {
                char check = text.charAt(0);
                if (Character.isDigit(check)) {
                    String[] columns = text.split("\t");
                    years.add(columns[0]);
                    values.add(Long.parseLong(columns[1].replaceAll(",", "")));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }

        int resultYear = 0;
        long value = 0;
        for (int i = 0; i < values.size() - 1; i++) {
            long result = values.get(i + 1) - values.get(i);
            if (result > value) {
                value = result;
                resultYear = i + 1;
            }
        }

        System.out.println(years.get(resultYear));
    }
}

