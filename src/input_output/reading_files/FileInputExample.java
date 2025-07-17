package input_output.reading_files;

import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets; // UTF_8

public class FileInputExample {
    /* Check resources folder */

    public static void main(String[] args) throws IOException {
        InputStream inputStream = FileInputExample.class.getClassLoader()
                .getResourceAsStream("textExample.txt");

        Scanner scanner = new Scanner(Objects.requireNonNull(inputStream), StandardCharsets.UTF_8);

        int lineCount = 0; // We start from zero and go to the end in the cycle from the bottom
        int lineNeeded = 1; // Input string from file

        // Reading a file and outputting the desired line
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            if (lineCount == lineNeeded) {
                System.out.println(nextLine);
            }
            lineCount++;
        }

        // Closing streams (working without try-with-resources)
        inputStream.close();
        scanner.close();
    }
}