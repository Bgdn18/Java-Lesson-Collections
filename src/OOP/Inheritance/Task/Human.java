package OOP.Inheritance.Task;

public abstract class Human {
    private boolean isMan;

    // Constructor
    public Human(boolean isMan) {
        this.isMan = isMan;
    }

    // Getter
    public boolean isMan() {
        return isMan;
    }

    public abstract void getSalary();
}
