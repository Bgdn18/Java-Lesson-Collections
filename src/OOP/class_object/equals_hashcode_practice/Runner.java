package OOP.class_object.equals_hashcode_practice;

public class Runner {
    public static void main(String[] args) {
        User vasya1 = new User("Vasya", "1812");
        User vasya2 = new User("Vasya", "1813");

        // HashCode
        // Created by login
        System.out.println(vasya1.hashCode());
        System.out.println(vasya2.hashCode());

        // Equals
        // By login and password
        System.out.println(vasya1.equals(vasya2));
    }
}
