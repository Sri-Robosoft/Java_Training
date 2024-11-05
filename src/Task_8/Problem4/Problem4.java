package Task_8.Problem4;

public class Problem4 {

//    public static void checkAge(int age) throws InvalidAgeException {
//        if(age>0 && age <=120 )
//            System.out.println("Age is valid");
//        else
//            throw new InvalidAgeException("Invalid Age");
//    }
//
//    public static void main(String[] args) {
//        try {
//            checkAge(10);
//            checkAge(125);
//        }
//        catch(InvalidAgeException e) {
//            System.out.println(e.toString());
//        }
//    }

    public static void checkAge(int age) {
        try {
            if (age > 0 && age <= 120)
                System.out.println("Age is valid");
            else
                throw new InvalidAgeException("Invalid Age");
        }
        catch(InvalidAgeException e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        checkAge(10);
        checkAge(125);
    }
}
