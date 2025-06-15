package OOP.Polymorphism.Inheritance.Dog.defend_dogs;

import OOP.Polymorphism.Inheritance.Dog.dogs.Dog;

public final class Shepherd extends Dog {

    public Shepherd() {
        super(28);
    }

    @Override
    public void run() {
        System.out.println("Shepherd runs slow");
    }

    @Override
    public void breath() {
        System.out.println("Shepherd is breathing");
    }

    @Override
    public void beAngry() {
        System.out.println(super.countLegs);
        System.out.println("The poodle saw the people");
        super.beAngry();
        System.out.println("The poodle calmed down");
    }
}
