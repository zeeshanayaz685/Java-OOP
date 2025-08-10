package Q5;

public class Car {
    private String registrationNum;
    private String modelName;
    private double rentalPrice;
    private boolean availability;

    public Car(String registrationNum, String modelName, double rentalPrice, boolean availability) {
        this.registrationNum = registrationNum;
        this.modelName = modelName;
        this.rentalPrice = rentalPrice;
        this.availability = availability;
    }

    public String getRegistrationNum() {
        return registrationNum;
    }

    public String getModelName() {
        return modelName;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Car: " + modelName + " (" + registrationNum + "), Price: $" + rentalPrice + "/day";
    }
}
