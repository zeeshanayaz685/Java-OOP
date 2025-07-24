package Q4k243023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First Course
        CourseClass obj1 = new CourseClass();
        System.out.println("Enter the name of the first course: ");
        String name1 = sc.nextLine();
        obj1.setName(name1);

        System.out.println("Enter the course code: ");
        String code1 = sc.next();
        obj1.setCourseCode(code1);

        System.out.println("Enter the credit hours (1-4): ");
        int hrs1 = sc.nextInt();
        obj1.setCreditHrs(hrs1);
        sc.nextLine(); // Consume newline

        // Second Course
        CourseClass obj2 = new CourseClass();
        System.out.println("Enter the name of the second course: ");
        String name2 = sc.nextLine();
        obj2.setName(name2);

        System.out.println("Enter the course code: ");
        String code2 = sc.next();
        obj2.setCourseCode(code2);

        System.out.println("Enter the credit hours (1-4): ");
        int hrs2 = sc.nextInt();
        obj2.setCreditHrs(hrs2);

        // Display course details
        System.out.println("\n--- Course 1 Details ---");
        System.out.println("Course Name: " + obj1.getName());
        System.out.println("Course Code: " + obj1.getCourseCode());
        System.out.println("Credit Hours: " + obj1.getCreditHrs());

        System.out.println("\n--- Course 2 Details ---");
        System.out.println("Course Name: " + obj2.getName());
        System.out.println("Course Code: " + obj2.getCourseCode());
        System.out.println("Credit Hours: " + obj2.getCreditHrs());

        sc.close();
    }
}
