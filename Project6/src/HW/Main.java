package HW;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 6, 7);
        Square square = new Square(10, 13);
        Circle circle = new Circle(10);

        triangle.countPerimeter();
        square.countPerimeter();
        circle.countPerimeter();
    }
}
