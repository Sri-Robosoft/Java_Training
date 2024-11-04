package Task_7.Problem1;

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1,"Abhay", 90));
        studentList.add(new Student(2,"Raj", 40));
        studentList.add(new Student(3,"Stuart", 70));
        studentList.add(new Student(4,"Howard", 68));

        for(Student s: studentList) {
            System.out.println("Roll No: "+s.getRollNo()+ " Name: "+s.getName()+ " Grade: "+s.getGrade());
        }

        Collections.sort(studentList);

        System.out.println("After Sorting: ");
        for(Student s: studentList) {
            System.out.println("Roll No: "+s.getRollNo()+ " Name: "+s.getName()+ " Grade: "+s.getGrade());
        }
    }
}
