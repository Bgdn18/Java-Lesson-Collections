package OOP.exceptions;

public class Exception {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        // / by zero 👇
        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        System.out.println("The program continues to work...");

        // Array exception 👇
        try {
            int[] ints = new int[5];
            System.out.println(ints[6]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("The program continues to work...");
    }
}
