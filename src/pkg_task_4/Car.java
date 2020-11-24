package pkg_task_4;

public class Car {
    private int carYear;
    private double carSpeed;
    private int carWeight;
    private String carColor;

    public Car() {
        this(2021, 250, 2800, "Red");
    }

    public Car(int carYear) {
        this(carYear, 251, 2801, "DarkRed");
    }

    public Car(int carYear, double carSpeed) {
        this(carYear, carSpeed, 2802, "DarkerRed");
    }

    public Car(int carYear, double carSpeed, int carWeight) {
        this(carYear, carSpeed, carWeight, "DarkestRed");
    }

    public Car(int carYear, double carSpeed, int carWeight, String carColor) {
        this.carYear = carYear;
        this.carSpeed = carSpeed;
        this.carWeight = carWeight;
        this.carColor = carColor;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public double getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(double carSpeed) {
        this.carSpeed = carSpeed;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(int carWeight) {
        this.carWeight = carWeight;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}
