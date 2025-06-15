package OOP.Polymorphism.interfaces.dependency_inversion;

import OOP.Polymorphism.interfaces.dependency_inversion.dogs.Poodle;
import OOP.Polymorphism.interfaces.dependency_inversion.dogs.Shepherd;

public class Nursery {
    private final Dog dog1;
    private final Dog dog2;

    public Nursery(Dog dog1, Dog dog2) {
        System.out.println("Constructor for any 2 dogs 🐕");
        this.dog1 = dog1;
        this.dog2 = dog2;
    }

    public Nursery(Poodle poodle, Shepherd shepherd) {
        System.out.println("Construction set for poodle and shepherd 🐕");
        this.dog1 = poodle;
        this.dog2 = shepherd;
    }
}
