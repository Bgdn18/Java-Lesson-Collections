package OOP.Polymorphism.interfaces.interfaces_inheritance;

public interface Alive extends Eatable, Moveable {
    @Override
    default void Eat() {
        Eatable.super.Eat();

        /*
                👆👆👆
        If an interface inherits two interfaces with the same method,
        you must explicitly specify which interface this method will
        be inherited from.
         */
    }
}