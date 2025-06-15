package OOP.Polymorphism.interfaces.interfaces_inheritance;

public class Dog implements Alive {

    @Override
    public void Eat() {
        System.out.println("The dog eats");
    }

    @Override
    public void Move() {
        System.out.println("The dog is walking");
    }
}
