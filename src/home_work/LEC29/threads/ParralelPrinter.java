package src.home_work.LEC29.threads;

public class ParralelPrinter {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyOwnThread("Thread1"));
        Thread thread2 = new Thread(new MyOwnThread("Thread2"));

        thread1.start();
        thread2.start();
    }
}
