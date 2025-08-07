package Q1;

import java.util.ArrayList;

public class Order {
    private int OrderId;
    private ArrayList<Product> products;
    private Customer customers;

    public Order(int id, Customer customers, ArrayList<Product> products) {
        this.OrderId = id;
        this.products = products;
        this.customers = customers;
    }

    public int getOrderId() {
        return OrderId;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Product " + p.getProductId() + " " + p.getProductName() + " added to order");
    }

    public void removeProduct(Product p) {
        if (!products.isEmpty()) {
            products.remove(p);
            System.out.println("Product " + p.getProductId() + " " + p.getProductName() + " removed from order");
        } else {
            System.out.println("No product found");
        }
    }

    public void displayOrder() {
        System.out.println("******* Order Details *******");
        System.out.println("Order Id: " + OrderId);
        System.out.println();
        System.out.println("Customer Details:");
        System.out.println("Customer Name: " + customers.getCustomerName());
        System.out.println("Customer Address: " + customers.getCustomerAddress());
        System.out.println();
        System.out.println("Product Details:");
        System.out.println("Products in Order:");
        for (Product p : products) {
            System.out.println("Product Id: " + p.getProductId());
            System.out.println("Product Name: " + p.getProductName());
            System.out.println("Product Price: " + p.getProductPrice());
            System.out.println("Product Quantity: " + p.getProductQuantity());
            System.out.println("Category Details:");
            for (Category c : p.getCategories()) {
                System.out.println("- " + c.getCategoryName() + ": " + c.getCategoryDescription());
                System.out.println();
            }
        }
    }
}
