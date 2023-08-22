package src.lections.other.lections;

public class Shape {
    public Shape(Integer length, Integer width) {
        this.length = length;
        this.width = width;
    }

    Integer length;
    Integer width;
    public void area() {
        System.out.println((length+width)*2);
    }
}
