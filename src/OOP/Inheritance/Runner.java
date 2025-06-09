package OOP.Inheritance;

public class Runner {
    public static void main(String[] args)
    {
        // Initialization
        Shepherd shepherd = new Shepherd();
        Poodle poodle = new Poodle();

        // Poodle
        System.out.println("_________Poodle__________");

        poodle.bark(); // output: The dog barks
        poodle.isAngry = true; // false -> true
        System.out.println("Angry: " + poodle.isAngry); // output: Angry: true
        poodle.run(); // output: Poodle runs fast
        poodle.breath(); // output: Poodle is breathing

        // Shepherd
        System.out.println("_________Shepherd__________");

        shepherd.bark(); // output: The dog barks
        shepherd.isAngry = false; // false -> false
        System.out.println("Angry: " + shepherd.isAngry); // output: Angry: false
        shepherd.run(); // output: Shepherd runs slow
        shepherd.breath(); // output: Shepherd is breathing
    }
}