package src.home_work.LEC12_Initialization;

public class Father {
    {
        System.out.println("Initiator in the Father class #2");
    }

    static {
        System.out.println("Static father #1");
    }

    public void firstFather() {
        System.out.println("Fathers public method #3");
    }
}
