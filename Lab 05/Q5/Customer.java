package Q5;

public class Customer {
    private String name;
    private String licenseNumber;
    private String contact;

    public Customer(String name, String licenseNumber, String contact) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "Customer: " + name + ", License: " + licenseNumber + ", Contact: " + contact;
    }
}
