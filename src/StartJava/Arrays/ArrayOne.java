package StartJava.Arrays;

import java.util.Arrays; // StartJava.Arrays

public class ArrayOne {
    public static void main(String[] args) {
        short x = 18; // short "x" = 18
        int y = 12; // int "y" = 12
        byte z = 5; // byte "z" = 5

        // First Method
        int[] array1 = new int[3];
        array1[0] = x; // Initialization array1 index: 0, number: x (18)
        array1[1] = y; // Initialization array1 index: 1, number: y (12)
        array1[2] = z; // Initialization array1 index: 2, number: z (5)

        // Second Method
        int[] array2 = {x,y,z}; // Initialization array2: x, y, z. Or 18, 12, 5

        // Output
        System.out.println("array1 without toString: " + array1); // Need a toString
        System.out.println("array2 without toString: " + array2 + "\n"); // Need a toString

        // Output with toString
        System.out.println("array1 toString: " + Arrays.toString(array1));
        System.out.println("array2 toString: " + Arrays.toString(array2) + "\n");

        // To get "10" at index "1" you can write:
        System.out.println("index 1 in array1 = " + array1[1]); // index "1" in "array1"
        // and array2
        System.out.println("index 1 in array2 = " + array2[1]); // index "1" in "array2"
    }
}
