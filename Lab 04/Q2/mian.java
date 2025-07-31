package Q2;

import java.util.Scanner;

public class mian {
    public static void main(String[] args) {
         Scanner sc = new  Scanner(System.in);
         Student obj = new Student();
         System.out.println("Default Account Created:");
         obj.display();

         System.out.print("Enter student Id = ");
         int id = sc.nextInt();
         System.out.print("Enter Student Name =");
         String name = sc.next();
         System.out.print("Enter Student CGPA = ");
         float cgpa = sc.nextFloat();
         Student obj2 = new Student(name,id,cgpa);
         System.out.print("New Student profile is created:\n");
         obj2.display();
         obj=null;
         System.gc();
         obj2=null;
         System.gc();

    }
}
