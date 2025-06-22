package OOP.anonymous_classes;

public class Runner {
    public static void main(String[] args) {

        // Anonymous class 👇

        // Dog 👇
        System.out.println("___Dog___");

        Alive dog = new Alive() {

            @Override
            public void breath() {
                System.out.println("The dog is breathing");
            }

            @Override
            public void eat() {
                System.out.println("Dog eats");
            }
        };

        dog.breath();
        dog.eat();

        // Cat 👇
        System.out.println("___Cat___");

        Animal cat = new Animal() {
            @Override
            public void eat() {
                System.out.println("Cat eats");
            }
        };

        System.out.println("Count legs: " + cat.countLegs);
        cat.eat();
    }
}
