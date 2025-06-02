package OOP.Cat;

public class RunnerCat {
    public static void main(String[] args)
    {
        System.out.println("\n____________________________________________\n");
        // Press Ctrl + P in IDEA if you forget which value to specify next
        Cat cat = new Cat("Vasya", "Sasha", "Red", 10.5); // Passing properties to cat
        System.out.println(cat);

        System.out.println("\n____________________________________________\n");

        System.out.println("Cat name: " + cat.catName);
        System.out.println("Cat owner: " + cat.ownerName);
        System.out.println("Cat color: " + cat.color);
        System.out.println("Cat weight: " + cat.weight);

        System.out.println("\n____________________________________________\n");

        cat.destroySofa("Maksim");

        System.out.println("\n____________________________________________\n");

        String huntResult = cat.hunt(false);
        System.out.println(huntResult);
    }
}