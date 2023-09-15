package src.home_work.LEC30.threads2;

import java.util.Random;

public class ValuePrinter implements Runnable {
    private final static Random randomizer = new Random();
    @Override
    public void run() {
        try {
            while(true) {
                int i = randomizer.nextInt(11);
                System.out.println("Value: " + i);
                Thread.sleep(1000);

                if (i == 5) {
                    System.out.println("Interrupting the thread as the last value is 5!");
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
    }
}
