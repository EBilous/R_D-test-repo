package src.lections.LEC14_interfaces;

/*Для прямокутника:
Площа = ширина * висота
Периметр = 2 * (ширина + висота)*/

public class Rectangle implements GeometricShape {

    private final Long length= 10L;
    private final Long width = 5L;

    @Override public void calculateArea() {
        System.out.println(length*width);
    }

    @Override public void calculatePerimeter() {
        System.out.println((length+width)*2);
    }
}
