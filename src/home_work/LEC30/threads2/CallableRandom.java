package src.home_work.LEC30.threads2;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableRandom implements Callable<Integer> {
    @Override
    public Integer call() {
        Random random = new Random();
        return random.nextInt(50) + 1; // Generate a random value from 1 to 50
    }
}
