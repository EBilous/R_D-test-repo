package src.lections.LEC14_interfaces;

public class Circle implements GeometricShape {

    private final Float radius= 5.5F;

    static Float pi = 3.14F;

    @Override public void calculateArea() {
        System.out.println(pi * (radius * radius));
    }

    @Override public void calculatePerimeter() {
        System.out.println(2*pi*radius);
    }
}
