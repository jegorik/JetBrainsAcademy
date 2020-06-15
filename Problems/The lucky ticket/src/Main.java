import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ticketNumbers = sc.nextLine();
        sc.close();
        int ticketPartsLenght = ticketNumbers.length() / 2;
        int ticketFirstPartSum = 0;
        int ticketSecondPartSum = 0;
        for (int i = 0; i < ticketPartsLenght; i++) {
            ticketFirstPartSum = ticketFirstPartSum + Integer.parseInt(String.valueOf(ticketNumbers.charAt(i)));
        }

        for (int i = ticketPartsLenght; i < ticketNumbers.length(); i++) {
            ticketSecondPartSum = ticketSecondPartSum + Integer.parseInt(String.valueOf(ticketNumbers.charAt(i)));
        }

        System.out.println(ticketFirstPartSum == ticketSecondPartSum ? "Lucky" : "Regular");
    }
}