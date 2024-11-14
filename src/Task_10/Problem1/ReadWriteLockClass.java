package Task_10.Problem1;

public class ReadWriteLockClass {

    private int readers;
    private int writers;
    private int writeRequests;

    public synchronized void lockRead() throws InterruptedException{
        while(writers > 0 || writeRequests > 0) {
            wait();
        }
        readers++;
    }

    public synchronized void unlockRead() {
        readers--;
        notifyAll();
    }

    public synchronized void lockWrite() throws InterruptedException {
        writeRequests++;
        while(writers > 0 || readers > 0) {
            wait();
        }
        writeRequests--;
        writers++;
    }

    public synchronized void unlockWrite() {
        writers--;
        notifyAll();
    }
}
