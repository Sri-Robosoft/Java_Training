package Task_9.Problem2;

public class Problem2 {
    public static void main(String[] args) {

        Pair<Integer, String> p1 = new Pair<>();
        Pair<String, Integer> p2 = new Pair<>();

        p1.setFirstValue(5);
        p1.setSecondValue("Helios");
        System.out.println(p1.getFirstValue());
        System.out.println(p1.getSecondValue());
        System.out.println(p1);

        p2.setFirstValue("Cryptos");
        p2.setSecondValue(9);
        System.out.println(p2.getFirstValue());
        System.out.println(p2.getSecondValue());
        System.out.println(p2);
    }
}
