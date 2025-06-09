package OOP.Inheritance;

public class Shepherd extends Dog {

    @Override
    public void run() {
        System.out.println("Shepherd runs slow");
    }

    @Override
    public void breath() {
        System.out.println("Shepherd is breathing");
    }
}
