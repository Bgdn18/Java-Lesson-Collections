package StartJava.String;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Bogdan";
        int age = 13;

        String phrase1 = "My name is " +  name + ". I'm " + age;
        System.out.println("Phrase1: " + phrase1);

        String phrase2 = String.format("My name is %s. I'm %d", name, age);
        System.out.println("Phrase2: " + phrase2);

        System.out.printf("SOUT: My name is %s. I'm %d", name, age); // Printf is used for this type of recording
    }
}
