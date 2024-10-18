public class JavaDataTypes {
    public static void main(String[] args) {

        String firstName = "Jeevan";
        String lastName = "Jain";
        int age = 70;
        float height = 5.9f;
        double weight = 50.443;
        boolean isEmployed = true;
        String[] skills = {"Java", "JavaScript", "SQL"};

        String fullName = "Mr. " +firstName+ " " +lastName;
        System.out.println("Original Name is : " +firstName);
        System.out.println("Full Name is : " +fullName);

        long ageInSeconds = age * (365L*24*60*60);
        System.out.println("Age in seconds : " +ageInSeconds);

        int numberOfSkills = skills.length;
        System.out.println("Number of skills possessed by Jeevan : " +numberOfSkills);

        long roundedWeight = Math.round(weight);
        System.out.println("Rounded weight is : " +roundedWeight);

    }
}
