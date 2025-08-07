package Q1;

import java.util.ArrayList;

public class Customer {
    private String CustomerName;
    private String CustomerAddress;
    private ArrayList<Order> Orders;

    public Customer(String CustomerName, String CustomerAddress) {
        this.CustomerName = CustomerName;
        this.CustomerAddress = CustomerAddress;
        this.Orders = new ArrayList<>();
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public ArrayList<Order> getOrders() {
        return Orders;
    }

    public void addOrder(Order order) {
        Orders.add(order);
        System.out.println("Order " + order.getOrderId() + " added successfully");
    }

    public void removeOrder(Order order) {
        if (!Orders.isEmpty()) {
            Orders.remove(order);
            System.out.println("Order " + order.getOrderId() + " removed successfully");
        } else {
            System.out.println("No order found!!!");
        }
    }
}
