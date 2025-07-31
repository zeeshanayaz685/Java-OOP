package Q3;

public class Cart {
    private String proName;
    private double price;
    private int quantity;
    public Cart(String proName, double price, int quantity) {
        this.proName = proName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getProName() {
        return proName;
    }
    public void setProName(String proName) {
        this.proName = proName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    Cart (){
        this.proName = "unknown";
        this.price = 0.0;
        this.quantity = 0;
    }
    void display (){

        System.out.println("Pro Name: " + getProName());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getQuantity());
    }


    protected void finalize() throws Throwable {
        System.out.println("Product Removed from Cart: "+getProName());
    }
}
