package OOP.Polymorphism.interfaces.functional_interfaces;

@FunctionalInterface
public interface Sounding {
    void makeSound();

    default void doSomething() {
        System.out.println("Do something");
    }
}
