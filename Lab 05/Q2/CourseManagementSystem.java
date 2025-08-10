package Q2;

public class CourseManagementSystem {
    public static void main(String[] args) {
        Student ali = new Student(1,"Ali");
        Student ahmed = new Student(2,"Bob");
        Student zee = new Student(3,"Charlie");
        System.out.println();

        Course MVC = new Course("MVC", "CAL101");
        Course CAL = new Course("CAL", "CS102");
        Course ICP = new Course("ICP", "CS103");
        System.out.println();

        ali.EnrollCourse(MVC);
        ahmed.EnrollCourse(CAL);
        zee.EnrollCourse(ICP);
        System.out.println();

        MVC.addAssignment("Assignment 1","23 March 2025","Do all Questions");
        CAL.addAssignment("Integeration","25 March 2025","Covers all topics for final");
        ICP.addAssignment("History of pakistan","2 March 2025","Related to the history of pakistan");
        System.out.println();

        MVC.DisplayCourseDetails();
        System.out.println();
        CAL.DisplayCourseDetails();
        System.out.println();
        ICP.DisplayCourseDetails();
        System.out.println();

        ali.DisplayStudents();
        ahmed.DisplayStudents();
        zee.DisplayStudents();




    }
}
