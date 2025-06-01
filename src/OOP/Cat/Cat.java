package OOP.Cat;

public class Cat {
    String catName;
    String ownerName;
    String color;
    double weight;

    // Humiliates its owner's couch.
    public void destroySofa(String ownerSofa) // Waiting for the owner's name to be entered in parentheses
    {
        System.out.printf("Destroy sofa %s!", ownerSofa); // print
    }

    // Generate with alt + insert
    public Cat(String catName, String ownerName, String color, double weight) {
        this.catName = catName;
        this.ownerName = ownerName;
        this.color = color;
        this.weight = weight;
    }

    // Generate with alt + insert
    @Override
    public String toString()
    {
        return "Cat: \n{\n" +
                "Cat Name: " + catName + '\n' +
                "Owner Name: " + ownerName + '\n' +
                "Color: " + color + '\n' +
                "Weight: " + weight +
                "\n}";
    }
}
