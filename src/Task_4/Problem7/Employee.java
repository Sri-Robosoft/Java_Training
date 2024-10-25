package Task_4.Problem7;

public class Employee {
    private String empName;
    private JobDetails job;

    Employee(int id, String role, String department, String name) {
        this.empName = name;
        this.job = new JobDetails(id, role, department);
    }

    public void getEmployeeDetails() {
        System.out.println("Employee name: " + empName);
        System.out.println("Employee ID: " + job.getEmpId());
        System.out.println("Role: " + job.getRole());
        System.out.println("Department: " + job.getDepartment());
    }
}

//public class Employee {
//    private String empName;
//
//    JobDetails job = new JobDetails();
//
//    Employee(String name) {
//        this.empName = name;
//    }
//
//    public void setEmployeeDetails(int id, String role, String department) {
//        job.setEmpId(id);
//        job.setRole(role);
//        job.setDepartment(department);
//    }
//
//    public void getEmployeeDetails() {
//        System.out.println("Employee name: " +empName);
//        System.out.println("Employee ID: " +job.getEmpId());
//        System.out.println("Role: " +job.getRole());
//        System.out.println("Department: " +job.getDepartment());
//    }
//}
