import java.util.Scanner;

/* Product - Motor */
abstract class Motor {

    String model;
    long power;

    public Motor(String model, long power) {
        this.model = model;
        this.power = power;
    }

    @Override
    public String toString() {
        String[] type;
        if (this.getClass().getSimpleName().contains("Motor")) {
            type = this.getClass().getSimpleName().split("Motor");
            return type[0] + " motor={model:" + model + ",power:" + power + "}";
        } else if (this.getClass().getSimpleName().contains("Drive")) {
            type = this.getClass().getSimpleName().split("Drive");
            return type[0] + " drive={model:" + model + ",power:" + power + "}";
        } else {
            return null;
        }
    }
}

class PneumaticMotor extends Motor {

    PneumaticMotor(String model, long power) {
        super(model, power);
    }
}

class HydraulicMotor extends Motor {

    HydraulicMotor(String model, long power) {
        super(model, power);
    }
}

class ElectricMotor extends Motor {

    ElectricMotor(String model, long power) {
        super(model, power);
    }
}

class WarpDrive extends Motor {

    WarpDrive(String model, long power) {
        super(model, power);
    }
}

class MotorFactory {

    /**
     * It returns an initialized motor according to the specified type by the first character:
     * 'P' or 'p' - pneumatic, 'H' or 'h' - hydraulic, 'E' or 'e' - electric, 'W' or 'w' - warp.
     */
    public static Motor make(char type, String model, long power) {
        switch (Character.toUpperCase(type)) {
            case 'P':
                return new PneumaticMotor(model, power);
            case 'H':
                return new HydraulicMotor(model, power);
            case 'E':
                return new ElectricMotor(model, power);
            case 'W':
                return new WarpDrive(model, power);
            default:
                return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char type = scanner.next().charAt(0);
        final String model = scanner.next();
        final long power = scanner.nextLong();
        MotorFactory mf = new MotorFactory();
        Motor motor = mf.make(type, model, power);
        scanner.close();
        System.out.println(motor);
    }
}