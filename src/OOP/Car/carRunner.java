package OOP.Car;

public class carRunner {
    public static void main(String[] args) {
        System.out.println("_________________Initialization and getCountCars________________");
        Car audi = new Car("audi");
        System.out.println(Car.getCountCars());
        Car bmw = new Car("bmw");
        System.out.println(Car.getCountCars());

        System.out.println("_________________get brand________________");
        System.out.println(bmw.getBrand());
        System.out.println(audi.getBrand());
    }
}
