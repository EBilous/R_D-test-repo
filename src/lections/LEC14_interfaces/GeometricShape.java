package src.lections.LEC14_interfaces;

/*Створіть інтерфейс "GeometricShape" з двома методами: "calculateArea()" та "calculatePerimeter()".
Створіть два класи: "Rectangle" та "Circle", які реалізують цей інтерфейс. Вони повинні коректно розраховувати площу та периметр для кожної форми.

Підказка з формулами:
Для прямокутника:
Площа = ширина * висота
Периметр = 2 * (ширина + висота)

Для кола:
Площа = π * (радіус^2)
Периметр (або довжина кола) = 2 * π * радіус*/

public interface GeometricShape {

    void calculateArea();
    void calculatePerimeter();

}
