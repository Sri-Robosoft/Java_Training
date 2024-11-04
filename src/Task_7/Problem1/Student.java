package Task_7.Problem1;

public class Student implements Comparable<Student> {
    private int rollNo;
    private String name;
    private int grade;

    Student(int rollNo, String name, int grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public float getGrade() {
        return grade;
    }

    public int compareTo(Student s) {
        return this.grade - s.grade;
    }
}
