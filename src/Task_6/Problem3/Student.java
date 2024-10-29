package Task_6.Problem3;

public class Student {
    private int id;
    private String name;
    private int[] grades;

    Student(int id, String name, int ...arr) {
        this.id = id;
        this.name = name;
        this.grades = arr;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }
}
