package Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        Q1 std1 = new Q1();
        System.out.print("Enter Stadium name = ");
        std1.name=obj.next();
        System.out.print("Enter City name = ");
        std1.city=obj.next();
        System.out.print("Enter capacity of the Stadium = ");
        std1.capacity=obj.nextInt();
        std1.matchesScheduled();

        System.out.println();
        Q1 std2 = new Q1();
        System.out.print("Enter Stadium name = ");
        std2.name=obj.next();
        System.out.print("Enter City name = ");
        std2.city=obj.next();
        System.out.print("Enter capacity of the Stadium = ");
        std2.capacity=obj.nextInt();
        std2.matchesScheduled();


        std1.display();
        std2.display();


    }

}
