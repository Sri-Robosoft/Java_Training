package Task_5;

public class Problem2 {
    public static void main(String[] args) {
        String result = "";
        StringBuilder sb = new StringBuilder();

        // String concatenation
        long time1 = System.currentTimeMillis();
        for(int i =0; i<100000; i++) {
            result += "Hello Hello";
        }
        long time2 = System.currentTimeMillis();

        // StringBuilder concatenation
        long time3 = System.currentTimeMillis();
        for(int i =0; i<100000; i++) {
            sb.append("Hello Hello");
        }
        long time4 = System.currentTimeMillis();

        System.out.println("String Performance: " +(time2-time1) +"ms");
        System.out.println("StringBuilder Performance: " +(time4-time3) +"ms");
    }
}
