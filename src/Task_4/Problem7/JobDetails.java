package Task_4.Problem7;

public class JobDetails {
    private int empId;
    private String role;
    private String department;

    JobDetails(int id, String role, String department) {
        this.empId = id;
        this.role = role;
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public String getRole() {
        return role;
    }

    public String getDepartment() {
        return department;
    }
}

//public class JobDetails {
//    private int empId;
//    private String role;
//    private String department;
//
//    public void setEmpId(int empId) {
//        this.empId = empId;
//    }
//
//    public int getEmpId() {
//        return empId;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    public String getRole() {
//        return role;
//    }
//}
