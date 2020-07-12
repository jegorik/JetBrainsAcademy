import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        sc.close();
        sentence = sentence.toUpperCase();
        System.out.println(sentence.indexOf("THE"));
    }
}