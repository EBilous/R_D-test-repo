package src.home_work.LEC12_Initialization;

public class Main {
    public static void main(String[] args) {
        Father father = new Father();
        father.firstFather();

        Father child = new Child();
        child.firstFather();
        Child.childMethod();
    }
}
