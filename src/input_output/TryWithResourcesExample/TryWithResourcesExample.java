package input_output.TryWithResourcesExample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TryWithResourcesExample {
    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "textExample.txt"; // File name in resources folder

        // The stream is closed automatically
        try (InputStream inputStream = TryWithResourcesExample.class.getClassLoader()
                .getResourceAsStream(fileName)) {

            // Is there a file?
            if (inputStream == null) {
                System.err.printf("File '%s' not found", fileName);
                return;
            }

            // Trying to read the file
            try (Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8)) {
                int lineCount = 0;

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                    lineCount++;
                }

                System.out.println("Successfully output: " + lineCount + " lines");
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        // All streams are closed
    }
}