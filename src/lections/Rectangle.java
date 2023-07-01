package src.lections;

public class Rectangle extends Shape {

    public Rectangle(Integer length, Integer width) {
        super(length, width);
    }
    @Override
    public void area() {
        System.out.printf("The area of rectangle with sides %s and %s is: " + length*width + "%n", length, width);
    }
}
