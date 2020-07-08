import java.util.Scanner;

class Time {

    int hour;
    int minute;
    int second;

    public static Time noon() {
        return of(12, 0, 0);
    }

    public static Time midnight() {
        return of(0, 0, 0);
    }

    public static Time ofSeconds(long seconds) {
        int hrs = (int) (seconds / 3600) % 24;
        int min = (int) (seconds % 3600) / 60;
        int sec = (int) seconds % 60;
        return of(hrs, min, sec);
    }

    public static Time of(int hour, int minute, int second) {
        Time current = new Time();
        current.hour = String.valueOf(hour).matches("^(2[0-3]|1[0-9]|[0-9])$") ? hour : -1;
        current.minute = String.valueOf(minute).matches("^[1-5]?[0-9]$") ? minute : -1;
        current.second = String.valueOf(second).matches("^[1-5]?[0-9]$") ? second : -1;
        if (current.hour >= 0 && current.minute >= 0 && current.second >= 0) {
            return current;
        } else {
            return null;
        }
    }
}

/* Do not change code below */
public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time = null;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                time = null;
                break;
        }

        if (time == null) {
            System.out.println(time);
        } else {
            System.out.println(String.format("%s %s %s", time.hour, time.minute, time.second));
        }
    }
}