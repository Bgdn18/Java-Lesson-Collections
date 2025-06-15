package OOP.Polymorphism.interfaces.task;

public class Fish implements Swimable {
    @Override
    public void swim() {
        System.out.println("Fish swim");
    }
}
