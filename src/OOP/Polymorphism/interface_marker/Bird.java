package OOP.Polymorphism.interface_marker;

public class Bird implements Alive {
    @Override
    public void breath() {
        System.out.println("Bird breath");
    }
}
