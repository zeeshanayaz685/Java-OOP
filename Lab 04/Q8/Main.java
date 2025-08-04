```java
package Q8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Initializing Employees and Managers at Systems Limited...");

        Employee emp1 = new Employee();
        emp1.showEmployeeInfo();

        System.out.println("Enter Employee Name:");
        String empName = scanner.nextLine();
        System.out.println("Enter Employee ID:");
        int empID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Employee Department:");
        String empDept = scanner.nextLine();

        Employee emp2 = new Employee(empName, empID, empDept);
        emp2.showEmployeeInfo();

        System.out.println("Enter Team Size:");
        int teamSize = scanner.nextInt();

        Manager mgr1 = new Manager(empName, empID, empDept, teamSize);
        mgr1.showManagerInfo();

        System.out.println("The Employee " + emp1.empName + " has been removed.");
        System.out.println("The Manager " + emp2.empName + " has been removed.");

        mgr1 = null;
        emp1 = null;
        System.gc();
    }
}
```