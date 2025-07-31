package Q12;

public class Class {
    private String title;
    private String author;
    private int price;
    public Class(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Class (String t ,String a){
        this.title = t;
        this.author =a;
        this.price=0;
    }
    public Class(String ti){
        this.title=ti;
        this.author="unknown";
        this.price=0;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void Display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
    }


}
