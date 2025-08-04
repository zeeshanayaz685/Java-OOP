```java
package Q9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Project assignment1 = new Project();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the title of the assignment");
        String title = scanner.nextLine();
        System.out.println("Enter the assignment deadline");
        String deadline = scanner.nextLine();

        Project assignment2 = new Project(title, deadline);
        assignment2.displayProjectDetails();

        System.out.println("Enter the estimated budget for the assignment");
        double budget = scanner.nextDouble();
        scanner.nextLine();

        assignment2 = new Project(title, deadline, budget);
        assignment2.displayProjectDetails();

        System.out.println("Enter the title of another assignment");
        String newTitle = scanner.nextLine();
        System.out.println("Enter the deadline for this assignment");
        String newDeadline = scanner.nextLine();
        System.out.println("Enter the estimated budget for the assignment");
        double newBudget = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the core feature of the assignment");
        String coreFeature = scanner.nextLine();

        AIProject assignment3 = new AIProject(newTitle, newDeadline, newBudget, coreFeature);
        assignment3.displayAIProjectDetails();

        System.out.println("The assignment " + assignment1.projectTitle + " is being removed");
        System.out.println("The assignment " + assignment2.projectTitle + " is being removed");
        System.out.println("The assignment " + assignment3.projectTitle + " is being removed");

        assignment1 = null;
        assignment2 = null;
        assignment3 = null;
        System.gc();
    }
}
