package Task_6.Problem1;

import java.util.*;

public class Duplicate {

    public static boolean checkDuplicate1(List<String> arrDuplicate) {
        for(int i=0; i<arrDuplicate.size(); i++) {
            for(int j=i+1; j<arrDuplicate.size();j++) {
                if(arrDuplicate.get(i).equalsIgnoreCase(arrDuplicate.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkDuplicate2(List<String> arrDuplicate) {
        Set<String> dupSet = new HashSet<>(arrDuplicate);

        return dupSet.size() != arrDuplicate.size();
    }

    public static void main(String[] args) {
        List<String> dupArray = new ArrayList<>();
        dupArray.add("Hi");
        dupArray.add("Hello");
        dupArray.add("Hii");
        dupArray.add("Hey");
        dupArray.add("Good");
        dupArray.add("Morning");
//        dupArray.add("Hello");

         // boolean isDuplicate = checkDuplicate1(dupArray);

         boolean isDuplicate = checkDuplicate2(dupArray);

        if(isDuplicate)
            System.out.println("ArrayList<String> has duplicate elements");
        else
            System.out.println("ArrayList<String> does not have duplicate elements");
    }
}
