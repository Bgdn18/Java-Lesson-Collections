package OOP.Inheritance;

public abstract class Dog extends Alive {
    /*
    ⬆️⬆️⬆️
    Since the class is abstract, it cannot exist on its own,
    and it can only exist thanks to its descendant classes
     */

    public boolean isAngry;
    public abstract void run();
    /*
    ⬆️⬆️⬆️
    In this case, the heirs must implement "run",
    otherwise there will be an error
     */

    public void bark() {
        System.out.println("The dog barks");
    }
}
