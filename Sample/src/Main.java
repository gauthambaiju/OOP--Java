package Java.Sample.src;

public class Main {
    public static void main(String[] args) {

        // System.out.println(bmw.isRunning);

        Car[] cars = {
                new Car("BMW", "black", true),
                new Car("Mercedes", "white", false),
                new Car("Mustang", "blue", true)
        };

        for (Car car : cars) {
            System.out.println(car.name);
            System.out.println(car.color);
            System.out.println(car.isRunning);
        }
        Car.TireNumber = 5;
        System.out.println(Car.TireNumber);
    }
}
