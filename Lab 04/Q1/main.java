package Q1;

import java.util.Scanner;

public class main {
    public static void main (String[] args){
        CustomerAccount obj = new CustomerAccount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer name = ");
        String name=sc.next();
        System.out.println("Enter Account number = ");
        long accno=sc.nextLong();
        System.out.println("Enter Account balance = ");
        double balance = sc.nextDouble();
        CustomerAccount obj1= new CustomerAccount(name,accno,balance);
        System.out.println("Default Account Created:");
        obj.Display();
        obj=null;
        System.gc();
        System.out.println("parametrised Account Created:");
        obj1.Display();

        obj1=null;
        System.gc();


    }
}
