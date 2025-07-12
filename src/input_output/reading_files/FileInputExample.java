package input_output.reading_files;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInputExample {
    /* Check resources folder */

    public static void main(String[] args) {
        InputStream inputStream = FileInputExample.class.getClassLoader()
                .getResourceAsStream("textExample.txt");

        Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8);
        int count = 0;
        //int lineNeeded = 1;

        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            //if (count == lineNeeded) {
                System.out.println(nextLine);
            //}
            count++;
        }
    }
}
