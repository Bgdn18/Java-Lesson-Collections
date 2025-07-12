package input_output.TryWithResourcesExample;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryWithResourcesExample {
    public static void main (String[] args) throws FileNotFoundException {
        // The stream is closed automatically
        try (FileReader fileReader =
                     new FileReader("Path_To_Text/textExample")) {
            System.out.println("Successfully");
        } catch (Exception e) {
            System.out.println("Catching the error: " + e.getMessage());
        }
    }
}