package Q7;

public class Book {
   private String title;
   private String authorName;
   private double price;
     Book(String title, String authorName, double price) {
         this.title = title;
         this.authorName = authorName;
         this.price = price;
     }
     public void setTitle(String title) {
         this.title =title ;
     }
     public void setAuthorName(String authorName) {
         this.authorName = authorName;
     }
     public void setPrice(double price) {
         this.price = price;
     }
     public String getTitle() {
         return title;
     }
     public String getAuthorName() {
         return authorName;
     }
     public double getPrice() {
         return price;
     }

    @Override
    public String toString() {
        return ("Title: " + title+"\nAuthor: " + authorName+"\nPrice: " + price);
     }
}
