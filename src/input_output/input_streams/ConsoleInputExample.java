package input_output.input_streams;

import java.util.Scanner;

public class ConsoleInputExample {
    public static void main(String[] args) {
        Calc calc = new Calc();
        Scanner scanner = new Scanner(System.in);

        // Number 1
        System.out.print("Enter the first number: ");
        long number1 = scanner.nextLong();

        // Number 2
        System.out.print("Enter the second number: ");
        long number2 = scanner.nextLong();

        // Operation
        System.out.print("Enter operation: ");
        String operation = scanner.next();

        // Calc
        System.out.println(calc.makeOperation(number1, number2, operation));
    }
}
