package hibproject;

public class Employee {
    private String empID = "root";
    private String empwd = "root";

    public Employee() {
    }

    public Employee(String empID, String empwd) {
        this.empID = empID;
        this.empwd = empwd;
    }

    public String getEmpwd() {
        return empwd;
    }

    public void setEmpwd(String empwd) {
        this.empwd = empwd;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }
}
