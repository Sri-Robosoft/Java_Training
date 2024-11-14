package Task_10.Problem3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Problem3 {
    public static void main(String[] args) {
        int numOfThreads = 4;
        int numOfTasks = 15;

        ThreadPoolTasks threadPool = new ThreadPoolTasks();
        ExecutorService executor = Executors.newFixedThreadPool(numOfThreads);

        for(int i=0; i<numOfTasks; i++) {
            int finalI = i;
            executor.submit(() -> threadPool.completeTasks(finalI+1));
        }

        executor.shutdown();

        try {
            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        }
}
