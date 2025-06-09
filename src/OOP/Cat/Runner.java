package OOP.Cat;

public class Runner {
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
        cat.destroySofa("Maksim"); // output: Destroy sofa Maksim!

        System.out.println("\n____________________________________________\n");
        String huntResult = cat.hunt(false); // Night
        System.out.println(huntResult); // if Day != true -> Bat

        System.out.println("\n____________________________________________\n");
        cat.feed("Food1", "Food2", "Food3");
    }
}