package OOP.Polymorphism.interfaces.basics;

public class Runner {
    public static void main(String[] args) {
        // Array declaration & initialization 👇👇👇
        Movable[] movables = {new Car(), new Dog()};

        // Foreach with “move” and “back” output 👇👇👇
        for (Movable movable : movables) {
            System.out.println("_________"); // Separation

            System.out.print("Move: ");
            movable.move(); // output: Move: The car is moving. Move: The dog is running

            System.out.print("Back: ");
            movable.back(); // output: Back: Going back. Back: The dog's coming back
        }
    }
}
