package Task_8.Problem1;

public class Problem1 {

    public static void parseStringToInteger(String str) {
        try{
            if(str.equalsIgnoreCase("null"))
                System.out.println("Null Pointer Exception");
            System.out.println(Integer.parseInt(str));
        }
        catch(NullPointerException | NumberFormatException e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        parseStringToInteger("12372637");
        parseStringToInteger("Hello");
        parseStringToInteger(null);
    }
}
