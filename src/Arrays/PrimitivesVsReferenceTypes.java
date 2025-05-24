package Arrays;

import java.util.Arrays;

public class PrimitivesVsReferenceTypes {
    public static void main(String[] args) {
        int x = 18;
        int y = 12;
        int z = 32;

        int[] originalArray = {x, y, z};   // Original array [18, 12, 32]
        int[] arrayReference = originalArray; // Not a real clone! Just a new reference to the same array

        // Modifying through the reference changes the original array
        arrayReference[0] = 21;
        arrayReference[1] = 43;
        arrayReference[2] = 54;
        System.out.println("After modifying through reference:");
        System.out.println("Original array = " + Arrays.toString(originalArray)); // [21, 12, 32]
        System.out.println("Reference array = " + Arrays.toString(arrayReference) + "\n"); // [21, 12, 32]

        // Reset the original array
        originalArray = new int[]{x, y, z};

        // Correct way to clone an array (creates a new independent copy)
        int[] clonedArray = originalArray.clone();
        clonedArray[0] = 21;
        clonedArray[1] = 43;
        clonedArray[2] = 54;

        System.out.println("After proper cloning and modification:");
        System.out.println("Original array = " + Arrays.toString(originalArray)); // [18, 12, 32]
        System.out.println("Cloned array = " + Arrays.toString(clonedArray));  // [21, 43, 54]
    }
}