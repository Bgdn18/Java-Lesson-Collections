package OOP.Inheritance.Task;

public class Runner {
    public static void main(String[] args) {
        Security security = new Security(true);
        AccountingManager accountingManager = new AccountingManager(false);
        Secretary secretary = new Secretary(false);

        System.out.println("___Security___");
        security.getSalary();
        System.out.println("isMan: " + security.isMan());

        System.out.println("___Secretary___");
        secretary.getSalary();
        secretary.drinkCoffee();
        System.out.println("isMan: " + secretary.isMan());

        System.out.println("___AccountingManager___");
        accountingManager.getSalary();
        accountingManager.drinkCoffee();
        System.out.println("isMan: " + accountingManager.isMan());
    }
}
