package Q2;

import java.util.ArrayList;

public class Student {
    private int StdId ;
    private String StdName ;
    private ArrayList<Course> CoursesEnrolled;
    public Student(int StdId, String StdName) {
        this.StdId = StdId;
        this.StdName = StdName;
        this.CoursesEnrolled = new ArrayList<>();
    }
    public int getStdId() {
        return StdId;
    }
    public String getStdName() {
        return StdName;
    }
   public void EnrollCourse(Course c){
        CoursesEnrolled.add(c);
       System.out.println("Course : "+c.getCourseName()+" added to the list");
   }
   public void DisplayStudents(){
       System.out.println("Student ID : "+StdId);
       System.out.println("Student Name :"+StdName);
       for(Course c :CoursesEnrolled){
           System.out.println("-Course Enrolled : "+c.getCourseName());

       }

   }


}
