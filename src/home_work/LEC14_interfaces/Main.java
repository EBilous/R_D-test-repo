package src.home_work.LEC14_interfaces;

public class Main {

    public static void main(String[] args) {
        Drive drive = new Driver();
        Fly fly = new Pilot();

        drive.drive();
        fly.fly();
    }
}
