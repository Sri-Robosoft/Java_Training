package Task_4.Problem2;

public class AddAndSub extends Calculator {
    public int add(int a, int b, int c) {
        return a+b+c;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("Overriding");
        return b-a;
    }
}
