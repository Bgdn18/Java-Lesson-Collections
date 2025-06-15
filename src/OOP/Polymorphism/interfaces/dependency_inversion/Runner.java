package OOP.Polymorphism.interfaces.dependency_inversion;

import OOP.Polymorphism.interfaces.dependency_inversion.dogs.Poodle;
import OOP.Polymorphism.interfaces.dependency_inversion.dogs.Shepherd;
import OOP.Polymorphism.interfaces.dependency_inversion.dogs.Terrier;

public class Runner {
    public static void main(String[] args) {
        Poodle poodle = new Poodle();
        Shepherd shepherd = new Shepherd();
        Terrier terrier = new Terrier();

        Nursery nursery1 = new Nursery(terrier, poodle);
        Nursery nursery2 = new Nursery(poodle, shepherd);
    }
}
