package OOP.Polymorphism.instanceof_ex;

public class Runner {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        /*
        You can't bark a dog,
        and you can't meow a cat because they come from animal instead of Cat and Dog
         */
        dog.eat();
        cat.eat();

        Animal[] zoo = {cat, dog};

        for (Animal animal : zoo) {
            if (animal instanceof Cat cat1) {
                cat1.sayMeow();

                // OR
                Cat cat2 = (Cat) animal;
                cat2.sayMeow();

                // OR
                ((Cat) animal).sayMeow();
            }
        }
    }
}
