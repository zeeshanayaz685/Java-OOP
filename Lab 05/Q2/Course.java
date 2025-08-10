package Q2;

import java.util.ArrayList;

public class Course {
    private String CourseName;
    private String CourseCode;
    private ArrayList<Student>StdEnrolled;
    private ArrayList<Assignment>assignments;
    public Course(String CourseName, String CourseCode) {
        this.CourseName = CourseName;
        this.CourseCode = CourseCode;
        this. StdEnrolled = new ArrayList<>();
        this.assignments = new ArrayList<>();

    }
    public String getCourseName() {
        return CourseName;
    }
    public String getCourseCode() {
        return CourseCode;
    }

    public void addStudent(Student s) {
        this.StdEnrolled.add(s);
        System.out.println("Student "+s.getStdName()+" added Successfully");
    }
    public void addAssignment(String title,String DueDate,String Description) {
        this.assignments.add(new Assignment(title,DueDate,Description));
    }
    public void DisplayCourseDetails(){
        System.out.println("Course Name:"+this.CourseName);
        System.out.println("Course Code:"+this.CourseCode);
        System.out.println("Students Enrolled:");
        for(Student s : StdEnrolled){
            System.out.println("-Students :"+s.getStdName());
        }
        System.out.println("Assignments need to be completed:");
        for(Assignment a : assignments){
            System.out.println("-Assignment :"+a.getTitle());
        }
    }



}
