```java
package Q7;

import java.util.ArrayList;

public class Project {
    static ArrayList<Project> taskList = new ArrayList<Project>();
    String taskName;
    String dueDate;
    float allocatedBudget;

    Project(String taskName, String dueDate, float allocatedBudget) {
        this.taskName = taskName;
        this.dueDate = dueDate;
        this.allocatedBudget = allocatedBudget;
        taskList.add(this);
        System.out.println("Task Created: " + this.taskName + ", Due Date: " + this.dueDate + ", Budget: $" + this.allocatedBudget);
    }

    Project(String taskName, String dueDate) {
        this.taskName = taskName;
        this.dueDate = dueDate;
        this.allocatedBudget = 0.0f;
        taskList.add(this);
        System.out.println("Task Created: " + this.taskName + ", Due Date: " + this.dueDate);
    }

    Project() {
        this.dueDate = "Not Set";
        this.allocatedBudget = 0.0f;
        this.taskName = "Untitled Task";
        taskList.add(this);
        System.out.println("Default Task Created: " + this.taskName + ", Due Date: " + this.dueDate + ", Budget: $" + this.allocatedBudget);
    }
}
```