package OOP.Polymorphism.task;

public class Runner {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        /*
        dog.bark();

        We won't be able to write the code above
        because the dog is declared as: Animal dog = new Dog();
         */

        feedTwoAnimals(dog, cat); // 👇👇👇
    }

    public static void feedTwoAnimals(Animal animal1, Animal animal2) {
        animal1.eat(); // output: Dog eats
        animal2.eat(); // output: Cat eats
    }
}
