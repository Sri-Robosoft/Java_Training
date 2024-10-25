package Task_5;

public class Problem4 {
    public static void main(String[] args) {

        // String
        String str = "String Default Methods";

        // Substring
        System.out.println(str.substring(15));

        // Split
        String[] strArray = str.split(" ");
        for(String s: strArray) {
            System.out.println(s);
        }

        // isEmpty
        System.out.println(str.isEmpty());

        // charAt
        System.out.println(str.charAt(7));

        // toUpperCase();
        System.out.println(str.toUpperCase());


        // StringBuffer
        StringBuffer sb2 = new StringBuffer("Good");

        // append
        sb2.append(" Evening");
        System.out.println("Append: "+sb2);

        // charAt
        System.out.println("charAt(4): "+sb2.charAt(2));

        // delete
        System.out.println("delete: "+sb2.delete(1,5));

        // toString
        System.out.println("String: "+sb2.toString());



        // StringBuilder
        StringBuilder sb1 = new StringBuilder("String Builder ");

        System.out.println("The Original String Builder is: "+sb1);

        // insert
        sb1.insert(15,"Default Methods");
        System.out.println("The String  After Inserting is: "+sb1);

        // reverse
        sb1.reverse();
        System.out.println("The String Builder after Reverse: "+sb1);
        }
}
