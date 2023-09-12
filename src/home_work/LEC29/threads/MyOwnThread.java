package src.home_work.LEC29.threads;

/*Створити 2 потоки, які паралельно виводять на консоль числа від 1 до 10 та пишуть назву потоку
*/

public class MyOwnThread  implements Runnable{

    private final String threadName;

    public MyOwnThread(String threadName) {
        this.threadName = threadName;
    }

    @Override public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(threadName + ": " + i);
        }
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

