package OOP.class_object.basic;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("Vasya");
        Class<? extends Cat> catClass = cat.getClass();

        System.out.println(catClass.getName());

        System.out.println(cat.toString());
    }
}
