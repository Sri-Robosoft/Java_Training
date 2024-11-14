package Task_10.Problem4;

import java.util.concurrent.CountDownLatch;

public class WorkerClass implements Runnable {
    private int workerCount;
    private CountDownLatch latch;

    WorkerClass(int workerCount, CountDownLatch latch) {
        this.workerCount = workerCount;
        this.latch = latch;
    }

    public void run() {
        try {
            System.out.println("Worker thread " +workerCount+ " has started the work");
            Thread.sleep((long)(Math.random()*1000));
            System.out.println("Worker thread " +workerCount+ " has completed the work");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Worker thread " +workerCount+ " was interrupted.");
        } finally {
            latch.countDown();
        }
    }
}
