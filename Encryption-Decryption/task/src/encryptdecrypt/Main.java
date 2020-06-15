package encryptdecrypt;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String operation = "enc";
        int key = 0;
        String data = "";
        String inputFilePatch = "";
        String outputFilePatch = "";

        for (int i = 0; i < args.length - 1; i++) {
            switch (args[i]) {
                case "-mode":
                    operation = args[i + 1];
                    break;
                case "-key":
                    key = Integer.parseInt(args[i + 1]);
                    break;
                case "-data":
                    data = args[i + 1];
                    break;
                case "-in":
                    inputFilePatch = args[i + 1];
                    break;
                case "-out":
                    outputFilePatch = args[i + 1];
                    break;
            }
        }

        if (!data.isEmpty() && !inputFilePatch.isEmpty() || data.isEmpty() && inputFilePatch.isEmpty() || !data.isEmpty() && inputFilePatch.isEmpty()) {
            saveFile(String.valueOf(processing(data, key, operation)), outputFilePatch);
        } else if (data.isEmpty() && !inputFilePatch.isEmpty()) {
            saveFile(String.valueOf(processing(openFile(inputFilePatch), key, operation)), outputFilePatch);
        }
    }

    private static StringBuilder processing(String data, int key, String operation) {
        StringBuilder result = new StringBuilder();

        switch (operation) {
            case ("dec"):
                for (int i = 0; i < data.length(); i++) {
                    result.append(Character.toString((int) (data.charAt(i)) - key));
                }
                break;
            case ("enc"):
                for (int i = 0; i < data.length(); i++) {
                    result.append(Character.toString((int) (data.charAt(i)) + key));
                }
                break;
        }
        return result;
    }

    private static String openFile(String inputFilePatch) {
        String data = "";
        try {
            data = new String(Files.readAllBytes(Paths.get(inputFilePatch)));
        } catch (IOException e) {
            System.out.println("Cannot read file: " + e.getMessage());
            System.exit(0);
        }
        return data;
    }

    private static void saveFile(String resultData, String outputFilePatch) {
        if (outputFilePatch.isEmpty()) {
            System.out.println(resultData);
        } else {
            try (FileWriter writer = new FileWriter(outputFilePatch)) {
                writer.write(resultData);
            } catch (IOException e) {
                System.out.printf("An exception occurs %s", e.getMessage());
            }
        }
    }
}
