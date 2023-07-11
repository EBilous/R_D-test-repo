package src.lections.LEC14_interfaces;

public class Main {

    public static void main(String[] args) {
        GeometricShape circle = new Circle();
        circle.calculateArea();
        circle.calculatePerimeter();

        GeometricShape rectangle = new Rectangle();
        rectangle.calculatePerimeter();
        rectangle.calculateArea();
    }


}
