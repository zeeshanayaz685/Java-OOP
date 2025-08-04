```java
package Q9;

public class Project {
    String taskTitle;
    String deadline;
    double estimatedBudget;

    public Project() {
        this.taskTitle = "Untitled Task";
        this.deadline = "No Deadline Set";
        this.estimatedBudget = 0.0;
        System.out.println("New Task Created");
        displayProjectDetails();
    }

    public Project(String taskTitle, String deadline) {
        this.taskTitle = taskTitle;
        this.deadline = deadline;
    }

    public Project(String taskTitle, String deadline, double estimatedBudget) {
        this(taskTitle, deadline);
        this.estimatedBudget = estimatedBudget;
    }

    public void displayProjectDetails() {
        System.out.println("\nTask Title: " + this.taskTitle + "\nDeadline: " + this.deadline + "\nEstimated Budget: $" + this.estimatedBudget);
    }
}

class AIProject extends Project {
    String coreFeature;

    AIProject(String taskTitle, String deadline, double estimatedBudget, String coreFeature) {
        super(taskTitle, deadline, estimatedBudget);
        this.coreFeature = coreFeature;
    }

    public void displayAIProjectDetails() {
        super.displayProjectDetails();
        System.out.println("Core Feature: " + this.coreFeature);
    }
}
```