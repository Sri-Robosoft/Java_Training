package Task_3;

public class Counter {
    private int count = 0;

    Counter() {
        count++;
    }

    public void getCount() {
        System.out.println("Number of instances created is: " +count);
    }
}
