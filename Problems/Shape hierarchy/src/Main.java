abstract class Shape {
    double sideA;
    double sideB;
    double sideC;

    public Shape(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Shape(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Shape(double sideA) {
        this.sideA = sideA;
    }

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {

    public Triangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}

class Rectangle extends Shape {

    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB);
    }

    @Override
    double getPerimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    double getArea() {
        return sideA * sideB;
    }
}

class Circle extends Shape {

    public Circle(double sideA) {
        super(sideA);
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * sideA;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(sideA, 2);
    }
}