package src.home_work.LEC14_interfaces;

public class Driver extends Human implements Drive {

    @Override
    public void drive() {
        System.out.println("I can drive!");
    }
}
