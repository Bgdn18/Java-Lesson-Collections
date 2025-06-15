package OOP.Polymorphism.Inheritance.Task;

public abstract class OfficeWorker extends Human {
    public OfficeWorker(boolean isMan) {
        super(isMan);
    }

    public void drinkCoffee (){
        System.out.println("An office worker drinking coffee");
    }
}
