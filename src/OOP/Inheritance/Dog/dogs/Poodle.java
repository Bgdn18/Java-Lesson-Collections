package OOP.Inheritance.Dog.dogs;

public class Poodle extends Dog {

    public Poodle() {
        super(28);
    }

    @Override
    public void run() {
        System.out.println("Poodle runs fast");
    }

    @Override
    public void breath() {
        System.out.println("Poodle is breathing");
    }
}
