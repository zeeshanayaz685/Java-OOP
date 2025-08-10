package Q12;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private ArrayList<Product> productList = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    public void add() {
        System.out.print("Enter the number of products to add: ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Product " + (i + 1));
            System.out.print("Enter Product ID: ");
            int pId = scan.nextInt();
            scan.nextLine();  // Consume newline
            System.out.print("Enter Product Name: ");
            String pName = scan.nextLine();
            System.out.print("Enter Product Price: ");
            double pPrice = scan.nextDouble();
            System.out.print("Enter Product Quantity: ");
            int pQuantity = scan.nextInt();

            productList.add(new Product(pId, pName, pPrice, pQuantity));
        }
        System.out.println("Product(s) added successfully!");
    }

    public void displayProducts() {
        if (productList.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        System.out.println("______________________________________________________________");
        System.out.println("| Product ID | Product Name | Product Price | Product Quantity |");
        System.out.println("______________________________________________________________");

        for (Product product : productList) {
            System.out.printf("| %-10d | %-12s | %-12.2f | %-15d |\n",
                    product.getProductId(), product.getProductName(),
                    product.getProductPrice(), product.getProductQuantity());
        }
        System.out.println("______________________________________________________________");
    }

    public void removeProduct() {
        if (productList.isEmpty()) {
            System.out.println("No products available to remove.");
            return;
        }

        System.out.print("Enter Product ID to remove: ");
        int productId = scan.nextInt();

        boolean found = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductId() == productId) {
                productList.remove(i);
                System.out.println("Product removed successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No product found with this ID.");
        }
    }

    public void updateProduct() {
        if (productList.isEmpty()) {
            System.out.println("No products available to update.");
            return;
        }

        System.out.print("Enter Product ID to update: ");
        int productId = scan.nextInt();

        boolean found = false;
        for (Product product : productList) {
            if (product.getProductId() == productId) {
                System.out.print("Enter new Product Quantity: ");
                int newQuantity = scan.nextInt();
                product.setProductQuantity(newQuantity);
                System.out.println("Product quantity updated successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No product found with this ID.");
        }
    }

    public void options() {
        while (true) {
            System.out.println("\n===== Inventory Management System =====");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display Products");
            System.out.println("4. Update Product Quantity");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    removeProduct();
                    break;
                case 3:
                    displayProducts();
                    break;
                case 4:
                    updateProduct();
                    break;
                case 5:
                    System.out.println("Exiting the Inventory System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("\nPress Enter to continue...");
            scan.nextLine();
        }
    }
}
