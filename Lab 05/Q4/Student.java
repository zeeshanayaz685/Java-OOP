package Q4;
import java.util.*;
public class Student {
    private int rollNumber;
    private String name;
    private String program;
    private List<Course> enrolledCourses;

    public Student(int rollNumber, String name, String program) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.program = program;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        if (enrolledCourses.stream().noneMatch(c -> c.getCourseCode().equals(course.getCourseCode()))) {
            enrolledCourses.add(course);
            course.registerStudent(this);
        }
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public List<Course> getEnrolledCourses() {
        return Collections.unmodifiableList(enrolledCourses);
    }
}
