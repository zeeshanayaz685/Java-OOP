package Q12;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title =");
        String title = sc.nextLine();
        System.out.print("Enter book author =");
        String author = sc.nextLine();
        System.out.print("Enter book price =");
        int price = sc.nextInt();
        sc.nextLine();
        Class obj1=new Class(title,author,price);
        System.out.print("Enter book title=");
        String t = sc.nextLine();
        System.out.print("Enter book author=");
        String a = sc.nextLine();
        Class obj2=new Class(t,a);
        System.out.print("Enter book title=");
        String ti = sc.nextLine();
        Class obj3=new Class(ti);
        System.out.println("*******************BOOK 1********************");
        obj1.Display();
        System.out.println("*******************BOOK 2********************");

        obj2.Display();
        System.out.println("*******************BOOK 3********************");
        obj3.Display();
    }
}
