package input_output;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputExample {
    public static void main(String[] args) {
        String fileName = "outputExample.txt"; // File name

        // Line 1 👇
        String menu1 = "Milk - 5$\n";
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) /* The file will be overwritten */ {
            fileOutputStream.write(menu1.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException("Error: " + e);
        }

        // Line 2 👇
        String menu2 = "Banana - 1$\n";
        try (FileWriter fileWriter = new FileWriter(fileName, true)) { // Without true - the file will be overwritten
            fileWriter.write(menu2);
        } catch (IOException e) {
            throw new RuntimeException("Error: " + e);
        }
    }
}