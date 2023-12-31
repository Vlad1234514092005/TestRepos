package HW;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;
    }

    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide1(double a) {
        if (a <= 0) {
            return;
        }
        this.side1 = a;
    }

    public void setSide2(double b) {
        if (b <= 0) {
            return;
        }
        this.side2 = b;
    }

    public void setSide3(double c) {
        if (c <= 0) {
            return;
        }
        this.side3 = c;
    }

    public void countPerimeter() {
        System.out.println(this.side1 + this.side2 + this.side3);
    }
}
