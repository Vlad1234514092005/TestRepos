package HW;

public class Square extends Shape {
    private double length;
    private double width;

    public Square() {
    }

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length) {
        if (length <= 0) {
            return;
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            return;
        }
        this.width = width;
    }

    public void countPerimeter() {
        System.out.println(this.length * 2 + this.width * 2);
    }
}
