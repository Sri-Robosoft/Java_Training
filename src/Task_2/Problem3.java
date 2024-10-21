package Task_2;
import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vowelCount = 0;
        int consonantCount = 0;
        String str = "";

        System.out.print("Enter a String: ");
        str = sc.nextLine().toLowerCase();

//        str.matches();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                vowelCount++;
            else if((str.charAt(i) >= 'a' || str.charAt(i) <= 'z') && str.charAt(i) !=' ')
                consonantCount++;
        }

        System.out.println("Vowel Count is: " +vowelCount);
        System.out.println("Consonant Count is: " +consonantCount);
    }
}
