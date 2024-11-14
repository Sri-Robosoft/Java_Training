package Task_10.Problem2;

public class Problem2 {
    public static void main(String[] args) {
        Sleeper sleep = new Sleeper();
        Thread sleepThread = new Thread(sleep);

        sleepThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.toString();
        }

        System.out.println("Interrupting the sleeper thread...");
        sleepThread.interrupt();
    }
}
