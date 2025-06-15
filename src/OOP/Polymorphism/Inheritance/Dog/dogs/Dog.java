package OOP.Polymorphism.Inheritance.Dog.dogs;

import OOP.Polymorphism.Inheritance.Dog.Alive;

public abstract class Dog extends Alive {
    /*
    ⬆️⬆️⬆️
    Since the class is abstract, it cannot exist on its own,
    and it can only exist thanks to its descendant classes
     */

    public boolean isAngry;
    public int countTeeth;
    protected final byte countLegs = 4;

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    public void bark() {
        System.out.println("The dog barks");
    }

    public void beAngry(){
        System.out.println("A dog barks at people");
    }

    public abstract void run();
    /*
    ⬆️⬆️⬆️
    In this case, the heirs must implement "run",
    otherwise there will be an error
     */
}