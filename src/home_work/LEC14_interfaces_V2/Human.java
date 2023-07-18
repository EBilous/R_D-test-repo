package src.home_work.LEC14_interfaces_V2;

public abstract class Human implements Fly, Drive {

    public void fly() {
        System.out.println("I can not fly");
    }

    public void drive() {
        System.out.println("I can not drive");
    }
}
