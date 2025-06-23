package OOP.exceptions.CreatingException;

public class Car {
    private boolean isBroken;

    public void start() throws Exception {
        if (isBroken){
            throw new CarIsBrokenException("The machine doesn't work");
        }
        System.out.println("The car started successfully...");
    }

    public Car(boolean isBroken) {
        this.isBroken = isBroken;
    }
}
