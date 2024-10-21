package Task_2;
import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int num=0;
        String space = " ";

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        if(num<=0)
            System.out.println("Please enter a positive integer");
        else {
            while(num!=1) {
                System.out.print(num + space);
                num = num%2==0 ? num/2 : (num*3) + 1;
            }
            System.out.println(num);
        }
    }
}
