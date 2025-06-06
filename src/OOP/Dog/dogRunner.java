package OOP.Dog;

public class dogRunner {
    public static void main(String[] args) {
        // Characteristics of the dog
        System.out.println("___________________newDog__________________");
        Dog dog = new Dog("Rocky", -10, "Alex Carter");

        /* The weight simply cannot be minus!
        Therefore, we set the average value to 5 */

        System.out.println(dog); // Dog: Rocky, weight: 5kg, owner: Mr. Alex Carter

        // setters
        System.out.println("___________________setters__________________");
        dog.setOwnerName("Sasha Terekhin"); // set
        dog.setDogName("Rex"); // set
        dog.setDogWeight(26); // set

        System.out.println(dog); // Dog: Rex, weight: 26kg, owner: Mr. Sasha Terekhin

        // getter
        System.out.println("___________________getters__________________");
        System.out.println(dog.getDogName()); // get: Rex
        System.out.println(dog.getOwnerName()); // get: Mr. Sasha Terekhin
        System.out.println(dog.getWeight()); // get: 26
    }
}