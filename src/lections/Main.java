package src.lections;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(9,5);
        Rectangle rectangle = new Rectangle(9,5);
        Circle circle = new Circle(9,5);
        shape.area();
        rectangle.area();
        circle.area();
    }
}
