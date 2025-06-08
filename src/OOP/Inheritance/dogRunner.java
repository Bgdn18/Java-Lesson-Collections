package OOP.Inheritance;

public class dogRunner {
    public static void main(String[] args) {
        // Dog (Parent)
        Dog dog = new Dog();
        dog.bark();
        dog.setAngry(true);
        System.out.println("Angry: " + dog.isAngry());

        // Poodle
        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.setAngry(true);
        System.out.println("Angry: " + poodle.isAngry());

        // Shepherd
        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.setAngry(false);
        System.out.println("Angry: " + shepherd.isAngry());
    }
}