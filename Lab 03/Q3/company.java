package Q3;

import java.util.List;
import java.util.Scanner;

//Design a Company class with attributes companyName, industryType, jobRole, and requiredSkills.
//////Implement methods scheduleInterview (Student student) to assign an interview slot to a student and
//////displayCompanyDetails() to show company information.
public class company {
    String companyName;
    String IndustryType;
    String jobRole;
    List<String> companyskills ;


}
 class Student{
    String name;
    String id ;
    List<String> skills;
    public Student (String name, String id,List<String>skills){
        this.name = name;
        this.id = id;
        this.skills = skills;
    }
    public String getName(){
        return name;
    }
     public String getId(){
        return id;
     }
     public List<String>  getSkills(){
        return skills;
     }

}
