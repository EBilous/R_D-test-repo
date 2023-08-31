package src.home_work.LEC27.singleton;

class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Завжди має бути приватний конструктор
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

