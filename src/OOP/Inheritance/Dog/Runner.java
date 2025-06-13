package OOP.Inheritance.Dog;

import OOP.Inheritance.Dog.defend_dogs.Shepherd;
import OOP.Inheritance.Dog.dogs.Poodle;
import OOP.Inheritance.Dog.dogs.Terrier;

public class Runner {
    public static void main(String[] args) {
        // Initialization
        Shepherd shepherd = new Shepherd();
        Poodle poodle = new Poodle();
        Terrier terrier = new Terrier();

        // Poodle
        System.out.println("_________Poodle__________");

        poodle.bark(); // output: The dog barks
        poodle.isAngry = true; // false -> true
        System.out.println("Angry: " + poodle.isAngry); // output: Angry: true
        poodle.run(); // output: Poodle runs fast
        poodle.breath(); // output: Poodle is breathing
        System.out.println(poodle.countTeeth);

        // Shepherd
        System.out.println("_________Shepherd__________");

        shepherd.bark(); // output: The dog barks
        shepherd.isAngry = false; // false -> false
        System.out.println("Angry: " + shepherd.isAngry); // output: Angry: false
        shepherd.run(); // output: Shepherd runs slow
        shepherd.breath(); // output: Shepherd is breathing
        System.out.println(shepherd.countTeeth);
        System.out.println("___beAngry___");
        shepherd.beAngry();
        System.out.println("___beAngry___");
        // Terrier
        System.out.println("_________Terrier__________");

        poodle.bark(); // output: The dog barks
        poodle.isAngry = false; // false -> false
        System.out.println("Angry: " + poodle.isAngry); // output: Angry: false
        poodle.run(); // output: Poodle runs fast
        poodle.breath(); // output: Poodle is breathing
        System.out.println(terrier.countTeeth);

    }
}