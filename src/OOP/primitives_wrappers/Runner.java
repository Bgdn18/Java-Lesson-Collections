package OOP.primitives_wrappers;

public class Runner {
    public static void main(String[] args) {
        // Integer.parseInt 👇
        System.out.println("___Integer.parseInt___");
        String text = "1000";
        int number = Integer.parseInt(text);
        System.out.println(number * 2); // output: 2000

        // Integer 👇
        System.out.println("___Integer___");
        Integer numberWrapper = 100;
        numberWrapper = null;
        try {
            System.out.println(numberWrapper * 2);
        } catch (NullPointerException ex) {
            System.out.println("Null pointer exception: " + ex);
        }

        // Boolean 👇
        System.out.println("___Boolean___");
        Boolean bool = true;
        System.out.println(bool);

        // Long 👇
        System.out.println("___Long___");
        Long lo = 100L;
        System.out.println(lo);

        // Float 👇
        System.out.println("___Float___");
        Float flo = 10F;
        System.out.println(flo);

        // Char 👇
        System.out.println("___Char___");
        Character charac = 'a';
        System.out.println(charac);

        // Double 👇
        System.out.println("___Double___");
        Double d = 10.0;
        System.out.println(d);
    }
}
