package HW;

public class Circle extends Shape {
    private double radius;
    private double diameter;
    private double pi = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = this.radius * 2.0;
        this.pi = 3.14;
    }

    public double getPI() {
        return this.pi;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getDiameter() {
        return this.diameter;
    }

    public void setRadiusAndDiameter(double radius) {
        if (radius <= 0) {
            return;
        }
        this.radius = radius;
        this.diameter = this.radius * 2.0;
    }

    public void countPerimeter() {
        System.out.println(2.0 * this.pi * this.radius);
    }
}
