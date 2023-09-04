package src.home_work.LEC27.singleton;

public class SingletonUsage {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same.");
        }

        singleton1.showMessage();
        singleton2.showMessage();
    }
}
