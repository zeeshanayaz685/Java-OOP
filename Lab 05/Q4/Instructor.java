package Q4;
import java.util.*;

public class Instructor {
    private String name;
    private String department;
    private List<Course> assignedCourses;

    public Instructor(String name, String department) {
        this.name = name;
        this.department = department;
        this.assignedCourses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        if (!assignedCourses.stream().anyMatch(c -> c.getCourseCode().equals(course.getCourseCode()))) {
            assignedCourses.add(course);
        }
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public List<Course> getAssignedCourses() {
        return Collections.unmodifiableList(assignedCourses);
    }

}
