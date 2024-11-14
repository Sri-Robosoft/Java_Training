package Task_10.Problem1;

import java.time.LocalTime;

public class WriterClass implements Runnable {

    private int threadID;
    private ReadWriteLockClass rwLock;

    WriterClass(int id, ReadWriteLockClass rwLock) {
        this.threadID = id;
        this.rwLock = rwLock;
    }

    public void run() {
        try {
            rwLock.lockWrite();
            System.out.println("Thread " +threadID+ " is writing " + LocalTime.now());
            Thread.sleep(1000);
            System.out.println("Thread " +threadID+ " has completed writing " + LocalTime.now());
            rwLock.unlockWrite();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
