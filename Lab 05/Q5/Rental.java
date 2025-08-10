package Q5;

public class Rental {
    private Customer customer;
    private Car car;
    private int rentalDuration;

    public Rental(Customer customer, Car car, int rentalDuration) {
        this.customer = customer;
        this.car = car;
        this.rentalDuration = rentalDuration;
        car.setAvailability(false);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Car getCar() {
        return car;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    @Override
    public String toString() {
        return "Rental: " + customer + ", Car: " + car + ", Duration: " + rentalDuration + " days";
    }
}
