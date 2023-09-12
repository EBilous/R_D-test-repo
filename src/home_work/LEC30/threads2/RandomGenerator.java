package src.home_work.LEC30.threads2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RandomGenerator {
    public static void main(String[] args) {
        int numberOfThreads = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);

        // Future objects collector for Callable tasks.
        List<Future<Integer>> futures = new ArrayList<>();

        // Submit tasks
        for (int i = 0; i < numberOfThreads; i++) {
            Callable<Integer> callableRandom = new CallableRandom();
            Future<Integer> future = executorService.submit(callableRandom);
            futures.add(future);
        }

        for (Future<Integer> future : futures) {
            try {
                int randomValue = future.get();
                System.out.println("Random Value: " + randomValue);
            } catch (InterruptedException | ExecutionException e) {
                System.out.println(e.getMessage());;
            }
        }

        // Shutdown executor
        executorService.shutdown();
    }
}