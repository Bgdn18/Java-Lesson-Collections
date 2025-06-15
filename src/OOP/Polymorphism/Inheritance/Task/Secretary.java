package OOP.Polymorphism.Inheritance.Task;

public class Secretary extends OfficeWorker {
    public Secretary(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("The secretary received a salary of ”30_000” ");
    }
}
