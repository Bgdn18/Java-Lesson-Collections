package OOP.Polymorphism.interfaces.basics;

public class Dog implements Movable {
    @Override
    public void move() {
        System.out.println("The dog is running");
    }

    @Override
    public void back() {
        System.out.println("The dog's coming back");
    }
}
