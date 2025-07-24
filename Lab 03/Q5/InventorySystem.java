package Q5;

import java.util.ArrayList;
import java.util.Scanner;

public class InventorySystem {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Product> productList = new ArrayList<>();

    public void addProduct() {
        Product product = new Product();

        System.out.print("Enter the product name: ");
        product.setName(scanner.nextLine());

        System.out.print("Enter the product ID: ");
        product.setId(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Enter the product price: ");
        product.setPrice(scanner.nextFloat());

        System.out.print("Enter the stock quantity: ");
        product.setStock(scanner.nextInt());
        scanner.nextLine();

        productList.add(product);
        System.out.println("Product added successfully!");
    }

    public void searchProductByName() {
        System.out.print("Enter the product name to search: ");
        String searchName = scanner.nextLine();

        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(searchName)) {
                displayProductDetails(product);
                handlePurchase(product);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void searchProductById() {
        System.out.print("Enter the product ID to search: ");
        int searchId = scanner.nextInt();
        scanner.nextLine();

        for (Product product : productList) {
            if (product.getId() == searchId) {
                displayProductDetails(product);
                handlePurchase(product);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    private void displayProductDetails(Product product) {
        System.out.println("\nProduct Details:");
        System.out.println("Name: " + product.getName());
        System.out.println("ID: " + product.getId());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Stock: " + product.getStock());
    }

    private void handlePurchase(Product product) {
        System.out.print("Do you want to purchase this product? (y/n): ");
        char choice = scanner.next().charAt(0);
        scanner.nextLine();

        if (choice == 'y' || choice == 'Y') {
            System.out.print("Enter the quantity to purchase: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            if (quantity <= product.getStock()) {
                product.setStock(product.getStock() - quantity);
                generateBill(product, quantity);
            } else {
                System.out.println("Insufficient stock. Available stock: " + product.getStock());
            }
        }
    }

    private void generateBill(Product product, int quantity) {
        System.out.println("\n------ Purchase Bill ------");
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product ID: " + product.getId());
        System.out.println("Price per Unit: $" + product.getPrice());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + (product.getPrice() * quantity));
        System.out.println("----------------------------");
    }
}