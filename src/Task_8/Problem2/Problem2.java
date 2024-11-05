package Task_8.Problem2;

public class Problem2 {

    public static int divideByZero(int a, int b) {

        try {
            return a/b;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmatic Exception " +e.getMessage());
            // throw e;
            throw new ArithmeticException("Divide By Zero (0)");
        }
    }

    public static void main(String[] args) {
        try {
            // System.out.println(divideByZero(10,2));
            System.out.println(divideByZero(5,0));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
