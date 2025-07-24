package Q1;

import java.util.Scanner;

public class Q1 {
    String name ;
    String city;
    long capacity;
    int matchesScheduled;
    void matchesScheduled(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter match Scheduled = ");
        this.matchesScheduled=obj.nextInt();
    }
    public void display (){
        System.out.println("Stadium Name : "+name);
        System.out.println("City : "+city);
        System.out.println("Capacity : "+capacity);
        System.out.println("Match Scheduled : "+matchesScheduled);
        System.out.println();

    }
}
