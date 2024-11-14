package Task_10.Problem4;

import java.util.concurrent.CountDownLatch;

public class Problem4 {
    public static void main(String[] args) {
        int numOfWorkers = 5;

        CountDownLatch latch = new CountDownLatch(numOfWorkers);

        for(int i=1; i<=numOfWorkers; i++) {
            new Thread(new WorkerClass(i, latch)).start();
        }

        try {
            latch.await();
            System.out.println("All worker threads have completed the work");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted while waiting.");
        }
    }
}
