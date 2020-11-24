package pkg_task_4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2010);
        Car car3 = new Car(2011, 211);
        Car car4 = new Car(2012, 212, 2212);
        Car car5 = new Car(2013, 213, 2213, "Gold");

        System.out.println("Year: " + car1.getCarYear() + ", Speed: " + car1.getCarSpeed() + ", Weight: " + car1.getCarWeight() + ", Color: " + car1.getCarColor());
        System.out.println("Year: " + car2.getCarYear() + ", Speed: " + car2.getCarSpeed() + ", Weight: " + car2.getCarWeight() + ", Color: " + car2.getCarColor());
        System.out.println("Year: " + car3.getCarYear() + ", Speed: " + car3.getCarSpeed() + ", Weight: " + car3.getCarWeight() + ", Color: " + car3.getCarColor());
        System.out.println("Year: " + car4.getCarYear() + ", Speed: " + car4.getCarSpeed() + ", Weight: " + car4.getCarWeight() + ", Color: " + car4.getCarColor());
        System.out.println("Year: " + car5.getCarYear() + ", Speed: " + car5.getCarSpeed() + ", Weight: " + car5.getCarWeight() + ", Color: " + car5.getCarColor());
                        
    }
}
