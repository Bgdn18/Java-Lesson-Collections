package OOP.exceptions;

import java.lang.Exception;

public class CheckedExceptions {
    public static void main(String[] args) throws Exception {
        startCar(0);

        System.out.println("Moving on...");
    }

    public static void startCar(int fuel) throws Exception {
        checkFuel(fuel);
        System.out.println("The car is moving...");
    }

    public static void checkFuel(int fuel) throws Exception {
        if (fuel < 1) {
            throw new Exception("No gasoline");
        }
    }
}
