package src.lections.other.lections;

public class Circle extends Shape{
    public Circle(Integer length, Integer width) {
        super(length, width);
    }

    @Override
    public void area() {
        System.out.println((length+width)*3);

    }
}
