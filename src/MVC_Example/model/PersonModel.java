package MVC_Example.model;

public class PersonModel {
    private int age;
    private String fName;
    private String lName;
    private float height;
    private double weight;
    private boolean isEmployed;
    private String[] skills;

    public PersonModel(int age, String fName, String lName, float height, double weight, boolean isEmployed, String[] skills) {
        this.age = age;
        this.fName = fName;
        this.lName = lName;
        this.height = height;
        this.weight = weight;
        this.isEmployed = isEmployed;
        this.skills = skills;
    }

    public String getName() {
        return fName;
    }

    public String getFullName() {
        return "Mr. " +fName+ " " +lName;
    }

    public long getAgeInSeconds() {
        return age*(365L*24*60*60);
    }

    public int getNumberOfSkills() {
        return skills.length;
    }

    public long getRoundedWeight() {
        return Math.round(weight);
    }
}
