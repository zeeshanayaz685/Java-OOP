package Q4;
import java.util.*;
public class CourseManagementSystem {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Dr. Ahmed", "Computer Science");
        Instructor instructor2 = new Instructor("Ms Urooj", "Mathematics");

        Course course1 = new Course("CS101", "Introduction to Programming", instructor1);
        Course course2 = new Course("MATH201", "MVC", instructor2);

        Student student1 = new Student(101, "mumtaz", "Computer Science");
        Student student2 = new Student(102, "ali", "CAL");

        student1.enrollInCourse(course1);
        student2.enrollInCourse(course1);
        student2.enrollInCourse(course2);

        generateReport(Arrays.asList(course1, course2));
    }

    public static void generateReport(List<Course> courses) {
        for (Course course : courses) {
            System.out.println("Course: " + course.getCourseName() + " (" + course.getCourseCode() + ")");
            System.out.println("Instructor: " + course.getInstructor().getName() + " - " + course.getInstructor().getDepartment());
            System.out.println("Enrolled Students:");
            for (Student student : course.getRegisteredStudents()) {
                System.out.println("  " + student.getName() + " (Roll No: " + student.getRollNumber() + ", Program: " + student.getProgram() + ")");
            }
            System.out.println();
        }
    }
}
