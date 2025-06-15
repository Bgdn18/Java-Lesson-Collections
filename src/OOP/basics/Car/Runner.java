package OOP.basics.Car;

public class Runner {
    public static void main(String[] args) {
        System.out.println("_________________Initialization and getCountCars________________");
        Car audi = new Car("audi");
        System.out.println("Count cars: " + Car.getCountCars());
        Car bmw = new Car("bmw");
        System.out.println("Count cars: " + Car.getCountCars());

        System.out.println("_________________get brand________________");
        System.out.println("Bmw brand: " + bmw.getBRAND());
        System.out.println("Audi brand: " + audi.getBRAND());
    }
}
