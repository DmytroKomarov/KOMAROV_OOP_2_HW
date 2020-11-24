package pkg_task_3;

public class Car {
    private int carYear;
    private double carSpeed;
    private int carWeight;
    private String carColor;

    public Car() {}

    public Car(int carYear) {
        this.carYear = carYear;
        this.carSpeed = 205;
        this.carWeight = 1900;
        this.carColor = "Black";
    }

    public Car(int carYear,double carSpeed) {
        this.carYear = carYear;
        this.carSpeed = carSpeed;
        this.carWeight = 2000;
        this.carColor = "Grey";
    }

    public Car(int carYear,double carSpeed,int carWeight) {
        this.carYear = carYear;
        this.carSpeed = carSpeed;
        this.carWeight = carWeight;
        this.carColor = "Blue";
    }

    public Car(int carYear,double carSpeed,int carWeight, String carColor) {
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
