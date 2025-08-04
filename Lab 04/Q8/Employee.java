```java
package Q8;

public class Employee {
    String empName;
    int empID;
    String empDepartment;

    public Employee() {
        this.empName = "Unknown";
        this.empID = 0;
        this.empDepartment = "Not Assigned";
    }

    public Employee(String empName, int empID, String empDepartment) {
        this.empName = empName;
        this.empID = empID;
        this.empDepartment = empDepartment;
    }

    public void showEmployeeInfo() {
        System.out.println("Employee Added: " + this.empName + "\nID: " + this.empID + "\nDepartment: " + this.empDepartment);
    }
}

class Manager extends Employee {
    int numberOfTeamMembers;

    Manager(String empName, int empID, String empDepartment, int numberOfTeamMembers) {
        super(empName, empID, empDepartment);
        this.numberOfTeamMembers = numberOfTeamMembers;
    }

    public void showManagerInfo() {
        System.out.println("Manager Assigned: " + this.empName + " leads a team of " + this.numberOfTeamMembers + " members.");
    }
}
```