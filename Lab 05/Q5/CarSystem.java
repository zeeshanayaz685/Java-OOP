package Q5;

import java.util.ArrayList;

public class CarSystem {
    private ArrayList<Car> cars;
    private ArrayList<Rental> rentals;

    public CarSystem() {
        cars = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void rentCar(Customer customer, Car car, int rentalDuration) {
        if (car.isAvailable()) {
            Rental rental = new Rental(customer, car, rentalDuration);
            rentals.add(rental);
            System.out.println("Car rented successfully!");
        } else {
            System.out.println("Car is not available for rent.");
        }
    }

    public void displayAvailableCars() {
        System.out.println("\nAvailable Cars:");
        boolean found = false;
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println(car);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cars available.");
        }
    }

    public void displayRentals() {
        System.out.println("\nRental Details:");
        if (rentals.isEmpty()) {
            System.out.println("No active rentals.");
        } else {
            for (Rental rental : rentals) {
                System.out.println(rental);
            }
        }
    }
}
