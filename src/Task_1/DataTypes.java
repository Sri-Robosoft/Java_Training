package Task_1;

public class DataTypes {
    public static void main(String[] args) {

        boolean boolValue = true;
        byte byteValue = 5;
        short shortValue = 15;
        int intValue = 99;
        char charValue = 'a';
        float floatValue = 5.4767f;
        double doubleValue = 8.4456563;
        long longValue = 4658786;
        String name = "Chandan";
        int[] arrValue = {1,2,3,4};

        System.out.println("Boolean is : " +boolValue );
        System.out.println("Byte is : " +byteValue );
        System.out.println("Short is : " +shortValue );
        System.out.println("Int is : " +intValue );
        System.out.println("Char is : " +charValue );
        System.out.println("Float is : " +floatValue );
        System.out.println("Double is : " +doubleValue );
        System.out.println("Long is : " +longValue );

        System.out.println("Name is : " +name);

        for(int num : arrValue) {
            System.out.println("Array elements are: " +num);
        }


    }
}
