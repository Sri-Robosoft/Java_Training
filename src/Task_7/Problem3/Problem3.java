package Task_7.Problem3;

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(9985, 83000L));
        empList.add(new Employee(2505, 26000L));
        empList.add(new Employee(1005, 70000L));
        empList.add(new Employee(4915, 83000L));
        empList.add(new Employee(8205, 67000L));

        for(Employee e: empList) {
            System.out.println("ID: "+e.getId()+ " Name: " +e.getSalary());
        }

        EmployeeIdSalary emp = new EmployeeIdSalary();
        Collections.sort(empList, emp);

        System.out.println("After Sorting");
        for(Employee e: empList) {
            System.out.println("ID: "+e.getId()+ " Name: " +e.getSalary());
        }
    }
}
