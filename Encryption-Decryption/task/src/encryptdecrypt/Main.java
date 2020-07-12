package encryptdecrypt;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


interface EncryptDecrypt {

    default String checkData(String data, String inputFilePatch) {
        if (!data.isEmpty() && !inputFilePatch.isEmpty() || data.isEmpty() && inputFilePatch.isEmpty() || !data.isEmpty()) {
            return "step1";
        } else {
            return "step2";
        }
    }

    default String openFile(String inputFilePatch) {
        String data = "";
        try {
            data = new String(Files.readAllBytes(Paths.get(inputFilePatch)));
        } catch (IOException e) {
            System.out.println("Cannot read file: " + e.getMessage());
            System.exit(0);
        }
        return data;
    }

    default void saveFile(String resultData, String outputFilePatch) {
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

enum AlgorithmType {
    SHIFT,
    UNICODE
}

abstract class Algorithm implements EncryptDecrypt {
    protected String operation;
    protected int key;
    protected String data;
    protected String inputFilePatch;
    protected String outputFilePatch;

    protected abstract StringBuilder createCypher(String data, int key, String operation);

    protected Algorithm(String operation, int key, String data, String inputFilePatch, String outputFilePatch) {
        this.operation = operation;
        this.key = key;
        this.data = data;
        this.inputFilePatch = inputFilePatch;
        this.outputFilePatch = outputFilePatch;
    }

    void makeFile() {
        String check = checkData(data, inputFilePatch);
        if (check.contains("step1")) {
            saveFile(String.valueOf(chooseOperation(data, key, operation)), outputFilePatch);
        } else if (check.contains("step2")) {
            saveFile(String.valueOf(chooseOperation(openFile(inputFilePatch), key, operation)), outputFilePatch);
        } else {
            System.out.println(check);
            System.exit(0);
        }
    }

    StringBuilder chooseOperation(String data, int key, String operation) {
        return createCypher(data, key, operation);
    }
}

class Shift extends Algorithm {

    protected Shift(String operation, int key, String data, String inputFilePatch, String outputFilePatch) {
        super(operation, key, data, inputFilePatch, outputFilePatch);
    }

    private char process(char character, int key, char check) {
        char result;
        int originalAlphabetPosition = character - check;
        int newAlphabetPosition = (originalAlphabetPosition + key) % 26;
        result = (char) (check + newAlphabetPosition);
        return result;
    }

    protected StringBuilder createCypher(String data, int key, String operation) {
        int value = operation.contains("enc") ? key : 26 - (key % 26);
        StringBuilder result = new StringBuilder();
        for (char character : data.toCharArray()) {
            if (String.valueOf(character).matches("[a-z]")) {
                result.append(process(character, value, 'a'));
            } else if (String.valueOf(character).matches("[A-Z]")) {
                result.append(process(character, value, 'A'));
            } else {
                result.append(character);
            }
        }
        return result;
    }
}


class Unicode extends Algorithm {
    protected Unicode(String operation, int key, String data, String inputFilePatch, String outputFilePatch) {
        super(operation, key, data, inputFilePatch, outputFilePatch);
    }

    protected StringBuilder createCypher(String data, int key, String operation) {
        int value = operation.contains("enc") ? key : key * -1;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            result.append(Character.toString((int) (data.charAt(i)) + value));
        }
        return result;
    }
}

class MakeCypher {
    public void processData(AlgorithmType algorithm, String operation, int key, String data, String inputFilePatch, String outputFilePatch) {
        switch (algorithm) {
            case SHIFT:
                new Shift(operation, key, data, inputFilePatch, outputFilePatch).makeFile();
                break;
            case UNICODE:
                new Unicode(operation, key, data, inputFilePatch, outputFilePatch).makeFile();
                break;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String algorithm = "";
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
                case "-alg":
                    algorithm = args[i + 1];
                    break;
            }
        }

        algorithm = algorithm.toLowerCase();
        MakeCypher cypher = new MakeCypher();

        if (algorithm.contains("unicode")) {
            cypher.processData(AlgorithmType.UNICODE, operation, key, data, inputFilePatch, outputFilePatch);
        } else if (algorithm.contains("shift") || algorithm.isEmpty()) {
            cypher.processData(AlgorithmType.SHIFT, operation, key, data, inputFilePatch, outputFilePatch);
        } else {
            System.out.println("Unknown algorithm type: " + algorithm);
            System.exit(0);
        }
    }
}