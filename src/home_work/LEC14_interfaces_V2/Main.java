package src.home_work.LEC14_interfaces_V2;

public class Main {

    public static void main(String[] args) {
        Human drive = new Driver();
        Human fly = new Pilot();

        // Only extended human is can drive or fly
        drive.drive();
        fly.fly();

        // Abstract human can't fly or drive
        drive.fly();
        fly.drive();
    }
}
