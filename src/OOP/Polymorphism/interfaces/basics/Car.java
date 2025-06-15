package OOP.Polymorphism.interfaces.basics;

public class Car implements Movable {
    @Override
    public void move() {
        System.out.println("The car is moving");
    }
}
