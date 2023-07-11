package src.lections.LEC14_interfaces;

/*Для прямокутника:
Площа = ширина * висота
Периметр = 2 * (ширина + висота)*/

public class Rectangle implements GeometricShape {

    Long area;
    Long perimeter;
    Long length= 10L;
    Long width = 5L;

    @Override public void calculateArea() {
        System.out.println(area=length*width);
    }

    @Override public void calculatePerimeter() {
        System.out.println(perimeter=(length+width)*2);
    }
}
