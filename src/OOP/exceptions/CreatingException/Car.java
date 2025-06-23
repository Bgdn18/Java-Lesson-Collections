package OOP.exceptions.CreatingException;

public class Car {
    private final boolean isBroken;

    // Constructor
    public Car(boolean isBroken) {
        this.isBroken = isBroken;
    }

    // Start with exception
    public void start() throws Exception {
        if (isBroken) {
            throw new CarIsBrokenException("The machine doesn't work");
        }
        System.out.println("The car started successfully...");
    }
}
