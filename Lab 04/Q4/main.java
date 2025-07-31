package Q4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee obj=new Employee();
        System.out.println("Default Employee Created:");
        obj.Display();

        System.out.println("\nNew employee added :");
        System.out.print("enter employee id =");
        int id = sc.nextInt();
        System.out.print("enter Employee name =");
        String name = sc.next();
        System.out.print("enter Basic salary =");
        double basicsalary = sc.nextDouble();
        System.out.print("enter tax deduction in percentage =");
        int tax = sc.nextInt();
        System.out.print("Enter bonus = ");
        float bonus = sc.nextFloat();
        double netsalaray = (basicsalary-(basicsalary/tax))+bonus;
        Employee obj1 = new Employee(id,name,basicsalary,bonus,tax,netsalaray);
            obj1.Display();
            obj=null;
            System.gc();
            obj1=null;
            System.gc();

    }
}
