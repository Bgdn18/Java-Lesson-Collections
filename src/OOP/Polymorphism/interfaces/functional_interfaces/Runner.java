package OOP.Polymorphism.interfaces.functional_interfaces;

public class Runner {
    public static void main(String[] args) {
        Sounding cat = new Cat();
        cat.makeSound();
        cat.doSomething();

        System.out.println("_________");

        Sounding bird = () -> System.out.println("The bird sings");
        bird.makeSound();
        bird.doSomething();
    }
}
