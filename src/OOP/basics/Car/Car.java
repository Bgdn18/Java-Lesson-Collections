package OOP.basics.Car;

public class Car {
    private final String BRAND;
    private static int countCars = 0;
    /*
    Using "static", we make countCars uniform for all instances,
    that is, we will have a single count for all classes.
     */
    {
        System.out.println("New car!");
    }

    public Car(String BRAND) {
        this.BRAND = BRAND;
        countCars++; // Add 1 to countCars
    }

    // getters
    public String getBRAND() {
        return BRAND;
    }

    public static int getCountCars() {
        return countCars;
    }
}
