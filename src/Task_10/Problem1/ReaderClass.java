package Task_10.Problem1;

import java.time.LocalTime;

public class ReaderClass implements Runnable{

    private int threadID;
    private ReadWriteLockClass rwLock;

    ReaderClass(int id, ReadWriteLockClass rwLock) {
        this.threadID = id;
        this.rwLock = rwLock;
    }

    public void run() {
        try {
            rwLock.lockRead();
            System.out.println("Thread " +threadID+ " is reading " + LocalTime.now());
            Thread.sleep(1000);
            System.out.println("Thread " +threadID+ " has completed reading " + LocalTime.now());
            rwLock.unlockRead();
        } catch (InterruptedException e) {
            System.out.println("Reader is interrupted");
            Thread.currentThread().interrupt();
        }
    }
}
