package Task_4.Problem2;

public class Problem2 {
    public static void main(String[] args) {
        AddAndSub c = new AddAndSub();

        int result1 = c.add(4,5);
        int result2 = c.add(4,5,6);
        int result3 = c.sub(4,5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
