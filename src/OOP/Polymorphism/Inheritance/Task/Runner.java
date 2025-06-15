package OOP.Polymorphism.Inheritance.Task;

public class Runner {

    //We create professions in the enterprise
    //A security guard is characterized by the ability to keep watch. Salary 15_000
    //Accountant is characterized by the ability to calculate taxes. An accountant is an office worker. Salary 50_000
    //The secretary is characterized by typing documents. A secretary is an office worker. Salary 30_000
    //Every office worker knows how to drink coffee.
    //Every person knows how to get a salary (characteristic for his profession).
    //Every person has a gender.
    //Create this structure in java.

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
