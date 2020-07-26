import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();
        switch (shape) {
            case "triangle":
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                sc.close();
                double perimeter = a + b + c;
                double s = perimeter / 2;
                System.out.println(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
                break;
            case "rectangle":
                double sideA = sc.nextDouble();
                double sideB = sc.nextDouble();
                sc.close();
                System.out.println(sideA * sideB);
                break;
            case "circle":
                double r = sc.nextDouble();
                sc.close();
                System.out.println(3.14d * Math.pow(r, 2));
                break;
            default:
                System.out.println("Unknown shape");
                break;
        }
    }
}