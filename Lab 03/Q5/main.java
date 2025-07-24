package Q5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int option;
        InventorySystem system = new InventorySystem();
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n1. Add Product");
            System.out.println("2. Search by Name");
            System.out.println("3. Search by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    system.addProduct();
                    break;
                case 2:
                    system.searchProductByName();
                    break;
                case 3:
                    system.searchProductById();
                    break;
                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (option != 4);

        input.close();
    }
}
