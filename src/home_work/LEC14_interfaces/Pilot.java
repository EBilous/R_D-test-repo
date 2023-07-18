package src.home_work.LEC14_interfaces;

public class Pilot extends Human implements Fly {
    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}
