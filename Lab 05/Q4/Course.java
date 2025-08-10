package Q4;
import java.util.*;
public class Course {
    private String courseCode;
    private String courseName;
    private Instructor instructor;
    private List<Student> registeredStudents;

    public Course(String courseCode, String courseName, Instructor instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
        this.registeredStudents = new ArrayList<>();
        instructor.assignCourse(this);
    }

    public void registerStudent(Student student) {
        if (registeredStudents.stream().noneMatch(s -> s.getRollNumber() == student.getRollNumber())) {
            registeredStudents.add(student);
        }
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public List<Student> getRegisteredStudents() {
        return Collections.unmodifiableList(registeredStudents);
    }
}
