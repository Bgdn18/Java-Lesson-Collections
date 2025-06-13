package OOP.Inheritance.Task;

public class AccountingManager extends OfficeWorker {
    public AccountingManager(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("The accountant received a salary of “50_000“ ");
    }
}
