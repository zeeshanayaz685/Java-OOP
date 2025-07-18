package Q10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
       while(true) {
           System.out.println("1.Enroll student");
           System.out.println("2.Update Student name");
           System.out.println("3.Remove Student");
           System.out.println("4,View Enrolled students");
           System.out.println("5,Exit");
           System.out.println("Enter your choice = ");
           int options = input.nextInt();
           switch(options) {
               case 1:
                   break;
               case 2:
                   break;
               case 3:
                   break;
               case 4:
                   break;
               case 5:
                   break;
               default:
                   System.out.println("Wrong choice. Try again.please enter option from 1-5");


           }
       }

    }
}
