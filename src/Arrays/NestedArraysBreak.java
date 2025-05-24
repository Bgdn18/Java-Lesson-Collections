package Arrays;

import java.util.Arrays;

public class NestedArraysBreak {
    public static void main(String[] args) {
        int[] group1 = {1,2,3,4};
        int[] group2 = {5,6,7,8};
        int[][] multiArray = {group1, group2}; // This creates a nested array

        System.out.println("▼____________________ForEach_______________________▼");
        for (int[] array : multiArray) // We make a regular foreach using two arrays
        {
            System.out.println(Arrays.toString(array)); // Output of arrays
        }

        System.out.println("\n▼__________Nested loop without if-else_____________▼");
        for (int[] array : multiArray) // Making a nested loop
        {
            for (int number : array) // Output "array" to "numbers" to get individual numbers
            {
                System.out.println(number); // Output "number"
            }
        }

        System.out.println("\n▼____________Nested loop with if-else_________________▼");
        MultiArray: // The MultiArray label allows you to exit both cycles by breaking
        for (int[] array : multiArray) // Making a nested loop
        {
            for (int number : array) // Output "array" to "numbers" to get individual numbers
            {
                if (number == 5)
                {
                    System.out.println("STOP: " + number);
                    break MultiArray;
                }
                else {
                    System.out.println("OK: " + number); // Output "number"
                }
            }
        }
    }
}
