package OOP.Polymorphism.Inheritance.Task;

public class Security extends Human {

    // Constructor
    public Security(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("The security guard received a paycheck of “15_000” ");
    }
}
