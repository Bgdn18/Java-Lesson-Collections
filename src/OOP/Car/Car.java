package OOP.Car;

public class Car {
    private final String brand;
    private static int countCars = 0;

    /*
    Using "static", we make countCars uniform for all instances,
    that is, we will have a single count for all classes.
     */

    public Car(String brand) {
        this.brand = brand;
        countCars++; //
    }

    // getters
    public String getBrand() {
        return brand;
    }

    public static int getCountCars() {
        return countCars;
    }
}
