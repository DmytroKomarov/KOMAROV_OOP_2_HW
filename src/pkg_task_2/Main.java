package pkg_task_2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2020);
        Car car3 = new Car(2020,"Red");

        System.out.println("Year: " + car1.getCarYear() + ", Color: " + car1.getCarColor());
        System.out.println("Year: " + car2.getCarYear() + ", Color: " + car2.getCarColor());
        System.out.println("Year: " + car3.getCarYear() + ", Color: " + car3.getCarColor());
    }
}
