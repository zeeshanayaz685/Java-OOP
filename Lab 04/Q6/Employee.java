package Q6;

public class Employee {
    private String name;
    private int Id;
    private String depart;

    public Employee(String name, int Id, String depart) {
        this.name = name;
        this.Id = Id;
        this.depart = depart;
        System.out.println("Employee Constructor: " + name + " (ID: " + Id + ") from " + depart);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }

    public String getDepart() {
        return depart;
    }
}