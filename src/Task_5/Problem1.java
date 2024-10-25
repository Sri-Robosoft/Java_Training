package Task_5;

public class Problem1 {
    public static void main(String[] args) {
        String str = "Helios";

        // String to StringBuilder
        StringBuilder sb = new StringBuilder(str);
        System.out.println("String to StringBuilder: " +sb);

        sb.append(" Hi");
        System.out.println("Modified StringBuidler: " +sb);

        // StringBuilder to String
        str = sb.toString();
        System.out.println("Modified StringBuilder to String: " +sb);

        System.out.println("String: " +str.substring(4));
    }
}
