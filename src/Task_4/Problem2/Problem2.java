package Task_4.Problem2;

public class Problem2 {
    public static void main(String[] args) {
        AddAndSub c1 = new AddAndSub();
        int result1 = c1.add(4,5);
        int result2 = c1.add(4,5,6);

        Calculator c2 = new AddAndSub();
        int result3 = c2.sub(1,5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
