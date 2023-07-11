package src.lections.LEC14_interfaces;

public class Circle implements GeometricShape {

    Float area;
    Float circleLength;
    Float radius= 5.5F;

    Float pi = 3.14F;

    @Override public void calculateArea() {
        System.out.println(area = pi * (radius * radius));
    }

    @Override public void calculatePerimeter() {
        System.out.println(circleLength=2*pi*radius);
    }
}
