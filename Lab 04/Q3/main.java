package Q3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Default Product Added:");
        Cart obj = new Cart();
        obj.display();
        System.out.println();


        System.out.print("Enter product name:");
        String product = sc.nextLine();
        System.out.print("Enter product price:");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity:");
        int quantity = sc.nextInt();
        Cart obj2 = new Cart(product,price,quantity);
        System.out.println();
        System.out.println("New Product Added:");
        obj2.display();
        System.out.println();
        obj=null;
        System.gc();
        obj2=null;
        System.gc();


    }
}
