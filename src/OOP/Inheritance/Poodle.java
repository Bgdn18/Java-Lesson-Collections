package OOP.Inheritance;

public class Poodle extends Dog {

    @Override
    public void run() {
        System.out.println("Poodle runs fast");
    }

    @Override
    public void breath() {
        System.out.println("Poodle is breathing");
    }
}
