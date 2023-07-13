package src.home_work.LEC12_Initialization;

public class Child extends Father {
    {
        System.out.println("Initiator in the Child class #5");
    }

    static {
        System.out.println("Static child #4");
    }
    @Override
    public void firstFather() {
        System.out.println("Inherited public method #6");
    }

    public static void childMethod() {
        System.out.println("Child's method #7");
    }
}
