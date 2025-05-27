package String;

public class StringClass {
    public static void main(String[] args) {
        System.out.println("\n_____________New String______________\n");

        final String newString1 = new String("NewString");
        final String newString2 = new String("NewString");
        System.out.println("newString1: " + newString1);
        System.out.println("newString2: " + newString2);

        System.out.println("== comparison result: " + (newString1 == newString2));
        System.out.println("equals() comparison result: " + newString1.equals(newString2));

        System.out.println("\nWhen creating new String objects, even with identical content,\n"
                + "they reference different memory locations in the heap. The == operator\n"
                + "compares references, while equals() compares content.");

        System.out.println("\n___________Normal String_____________\n");

        final String normalString1 = "NormalString";
        final String normalString2 = "NormalString";
        System.out.println("normalString1: " + normalString1);
        System.out.println("normalString2: " + normalString2);

        System.out.println("== comparison result: " + (normalString1 == normalString2));
        System.out.println("equals() comparison result: " + normalString1.equals(normalString2));

        System.out.println("\nWith string literals, Java uses the string pool. When contents are identical,\n"
                + "the same reference is reused from the pool, so == returns true. If the content\n"
                + "didn't exist in the pool, a new entry would be created.");
    }
}