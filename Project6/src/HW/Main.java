package HW;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(3, 6, 7);
        Shape square = new Square(10, 13);
        Shape circle = new Circle(10);
        Account account = new Account(10000);

        triangle.countPerimeter();
        square.countPerimeter();
        circle.countPerimeter();
        System.out.println();
        triangle.countSquare();
        square.countSquare();
        circle.countSquare();
    }
}
