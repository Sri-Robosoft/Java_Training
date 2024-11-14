package Task_10.Problem1;

public class Problem1 {
    public static void main(String[] args) {
        ReadWriteLockClass rwLock = new ReadWriteLockClass();

        for(int i=1; i<=3; i++) {
            new Thread(new ReaderClass(i, rwLock)).start();
            new Thread(new WriterClass(i, rwLock)).start();
        }
    }
}
