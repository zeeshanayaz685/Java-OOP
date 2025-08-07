package Q1;

import java.util.ArrayList;

public class OrderManagementSystem {
    public static void main(String[] args) {

        Customer c1 = new Customer("Ali", "Kala board Karachi");

        ArrayList<Category> pro1Category = new ArrayList<>();
        Category category1 = new Category("Dairy", "Milk Products");
        pro1Category.add(category1);

        ArrayList<Category> pro2Category = new ArrayList<>();
        Category category2 = new Category("Electronics", "Electrical items");
        pro2Category.add(category2);

        Product dairy = new Product(1, "Milk", 500, 1, pro1Category);
        Product electronics = new Product(2, "32' inches LCD", 5000, 2, pro2Category);

        ArrayList<Product> products = new ArrayList<>();
        products.add(dairy);
        products.add(electronics);

        Order o1 = new Order(1, c1, products);

        c1.addOrder(o1);
        o1.displayOrder();

        o1.removeProduct(dairy);
        o1.displayOrder();


        Category newCategory = new Category("Fresh", "Fresh Milk Products");
        dairy.addcategory(newCategory);


        dairy.removecategory(category1);
        System.out.println("****Updated Order Details****");
        o1.displayOrder();
    }
}
