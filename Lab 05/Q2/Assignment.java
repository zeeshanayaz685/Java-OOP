package Q2;

public class Assignment {
    private String Title;
    private String DueDate;
    private String Description;
    public Assignment(String Title, String DueDate, String Description) {
        this.Title = Title;
        this.DueDate = DueDate;
        this.Description = Description;
    }
    public String getTitle() {
        return Title;
    }
    public String getDueDate() {
        return DueDate;
    }
    public String getDescription() {
        return Description;
    }
    public void displayAssignment(){
        System.out.println("Title: " + Title);
        System.out.println("DueDate: " + DueDate);
        System.out.println("Description: " + Description);
    }
}
