package pkg_task_2;

public class Car {
    private int carYear;
    private String carColor;

    public Car() {}

    public Car(int carYear) {
        this.carYear = carYear;
    }

    public Car(int carYear, String carColor) {
        this.carYear = carYear;
        this.carColor = carColor;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}
