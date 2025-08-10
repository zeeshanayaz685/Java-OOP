package Q5;

public class CarManagement {
    private String carName;

    public CarManagement(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    @Override
    public String toString() {
        return carName;
    }
}
