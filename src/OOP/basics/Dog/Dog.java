package OOP.basics.Dog;

public class Dog
{
    private String name;
    private int weight;
    private String owner;

    static {
        System.out.println("A new dog is born!");
    }

    // set
    public void setDogName(String name) {
        this.name = name;
    }

    public void setDogWeight(int weight) {
        this.weight = Weight(weight);
    }

    public void setOwnerName(String owner) {
        this.owner = OwnerTitle(owner);
    }

    // get
    public String getDogName() { return name; }
    public int getWeight() { return weight; }
    public String getOwnerName() { return owner; }

    // Private Methods
    private int Weight(int weight) {
        return (weight < 1) ? 5 : weight; // If weight < 1 → set 5
    }

    private String OwnerTitle(String owner) {
        return owner.startsWith("Mr.") ? owner : "Mr. " + owner; // Add "Mr." if not
    }

    // Output
    @Override
    public String toString() {
        return String.format("Dog: %s, weight: %dkg, owner: %s", name, weight, owner);
    }

    // Constructor
    public Dog(String name, int weight, String owner) {
        this.name = name;
        this.weight = Weight(weight);
        this.owner = OwnerTitle(owner);
    }
}