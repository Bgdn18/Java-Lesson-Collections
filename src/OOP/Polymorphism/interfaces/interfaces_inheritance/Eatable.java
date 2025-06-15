package OOP.Polymorphism.interfaces.interfaces_inheritance;

public interface Eatable {
    default void Eat() {
        System.out.println("Object eats");
    }
}