package For;

public class ForI {
    public static void main(String[] args) {
        int[] numbers = {24,5,20,25};
        for (int i = 0; i < 4; i++) {
            System.out.println("Index in \"numbers\": " + i); // Output index of "numbers"
            System.out.println(numbers[i]); // We substitute the number "i" for the index "number" in the array.
        }
    }
}
