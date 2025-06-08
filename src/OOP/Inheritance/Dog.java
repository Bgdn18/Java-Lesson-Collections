package OOP.Inheritance;

public class Dog {
    private boolean isAngry;

    public void bark() {
        System.out.println("The dog barks");
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }
}
