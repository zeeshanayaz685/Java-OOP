package Q1;

import java.util.ArrayList;

public class Product {
    private int ProductId;
    private String productName;
    private double productPrice;
    private int productQuantity;
    ArrayList<Category>categories;
    public Product(int id,String productName, double productPrice, int productQuantity, ArrayList<Category> categories) {
        this.ProductId = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.categories = categories;
    }
    public int getProductId() {
        return ProductId;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public int getProductQuantity() {
        return productQuantity;
    }
    public ArrayList<Category> getCategories() {
        return categories;
    }
    public String getProductName() {
        return productName;
    }
    public void addcategory(Category category) {
        categories.add(category);
        System.out.println("Category "+category.getCategoryName()+" added");
    }
    public void removecategory(Category category) {
        if(!categories.isEmpty()) {
            categories.remove(category);
            System.out.println("Category "+category.getCategoryName()+" removed");
        }else{
            System.out.println("No Category found");
        }
    }

}
