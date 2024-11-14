package Task_10.Problem2;

public class Sleeper implements Runnable {
    public void run() {
        try {
            System.out.println("Sleeper thread is going to sleep for 10 seconds...");
            Thread.sleep(10000);
            System.out.println("Sleeper thread finished sleeping.");
        } catch (InterruptedException e) {
            System.out.println("Sleeper thread was interrupted during sleep.");
            Thread.currentThread().interrupt();
        }
    }
}
