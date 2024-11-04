package Task_7.Problem3;

import java.util.Comparator;

public class EmployeeIdSalary implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        if(e1.getSalary() == e2.getSalary()) {
            return e1.getId() - e2.getId();
        } else {
            return (int) (e1.getSalary() - e2.getSalary());
        }
    }
}
