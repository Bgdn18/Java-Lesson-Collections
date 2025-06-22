package OOP.exceptions;

import java.lang.Exception;

public class Finally {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (Exception ex) {
            throw new ArithmeticException("Error");
        } finally {
            System.out.println("The program continues to work...");
        }
    }
}