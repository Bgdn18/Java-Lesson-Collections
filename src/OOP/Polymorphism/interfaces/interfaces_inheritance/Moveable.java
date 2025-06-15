package OOP.Polymorphism.interfaces.interfaces_inheritance;

public interface Moveable {
    void Move();

    default void Eat() {
        System.out.println("Moveable eats");
    }
}