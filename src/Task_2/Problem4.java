package Task_2;
import java.util.*;

public class Problem4 {

    static void vowelOrConsonant(char ch) {
        if(ch >= 'a' && ch <= 'z') {
            switch(ch) {
                case 'a','e','i','o','u' -> System.out.println("It is a vowel");
                default -> System.out.println("It is a consonant");
            }
        } else
            System.out.println("Invalid Character");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char charLetter;

        System.out.print("Enter a character: ");
        charLetter = sc.next().toLowerCase().charAt(0);

        vowelOrConsonant(charLetter);
    }
}
