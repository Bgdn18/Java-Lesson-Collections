package OOP.Polymorphism.interfaces.task;

public class Duck implements Flying, Swimable {
    /*
                    👆👆👆
    Our duck can fly and swim at the same time,
    so it comes from 2 interfaces at once
     */

    @Override
    public void fly() {
    }

    @Override
    public void swim() {
        System.out.println("Duck swim");
    }
}
