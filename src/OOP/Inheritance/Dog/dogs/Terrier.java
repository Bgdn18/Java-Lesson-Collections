package OOP.Inheritance.Dog.dogs;

public class Terrier extends Dog {

    // constructor ⬇⬇⬇
    public Terrier() {
        super(27);
        // And now we have 27 teeth by default
    }

    /*
    We definitely need to implement the "run" and "breathe" methods
    ⬇️⬇️⬇️
    */
    @Override
    public void run() {
        System.out.println("Terrier runs fast");
    }

    @Override
    public void breath() {
        System.out.println("Terrier is breathing");
    }
}
