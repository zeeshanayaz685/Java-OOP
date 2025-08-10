package Q5;

public class Main {
    public static void main(String[] args) {

        CarManagement sedan = new CarManagement("Sedan");
        CarManagement suv = new CarManagement("SUV");
        CarManagement hatchback = new CarManagement("Hatchback");

        Car car1 = new Car("ABC123", "Toyota Camry", 50.0, true);
        Car car2 = new Car("XYZ456", "Ford Explorer", 70.0, true);
        Car car3 = new Car("LMN789", "Honda Civic", 40.0, true);

        Customer customer1 = new Customer("John Doe", "DL12345", "john.doe@example.com");
        Customer customer2 = new Customer("Jane Smith", "DL67890", "jane.smith@example.com");

        CarSystem system = new CarSystem();
        system.addCar(car1);
        system.addCar(car2);
        system.addCar(car3);

        system.displayAvailableCars();

        system.rentCar(customer1, car1, 5);
        system.rentCar(customer2, car2, 3);

        system.displayRentals();
        system.displayAvailableCars();
    }
}
