package String;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args)
    {
        String text = "Hello world!";
        System.out.println("text: " + text);

        // Conversion to lowercase
        System.out.println("_____lowercase____");
        String lowercase = text.toLowerCase();
        System.out.println("The original text: " + text);                    // output: Text: Hello world!
        System.out.println("Lowercase: " + lowercase);

        // Conversion to uppercase
        System.out.println("_____uppercase____");
        String uppercase = text.toUpperCase();
        System.out.println("The original text: " + text);                    // output: Text: Hello world!
        System.out.println("Uppercase: " + uppercase);

        // Line length
        System.out.println("_____length____");
        int length = text.length();
        System.out.println("The original text: " + text);
        System.out.println("text length: " + length);

        // Is there any other text in the text
        System.out.println("_____containsHello____");
        boolean containsHello = text.contains("Hello");
        System.out.println("The original text: " + text);                    // output: Text: Hello world!
        System.out.println("Contains \"Hello\" in text: " + containsHello);

        // Replacing all pieces of text (substrings) with another text
        System.out.println("_____replacedText____");
        String replacedText = text.replaceAll("o", "a");
        System.out.println("The original text: " + text);                    // output: Text: Hello world!
        System.out.println("Replaced text (o with a): " + replacedText);

        // Repeat the text N times
        System.out.println("_____repeatedText____");
        String repeatedText = text.repeat(10);
        System.out.println("Text repeated 10 times: " + repeatedText);

        // Split the text into a String array
        System.out.println("_____namesArray____");
        String friendsNames = "Bogdan;Sasha;Maksim;Zakhar";
        System.out.println("friendsNames: " + friendsNames);
        String[] namesArray = friendsNames.split(";");
        System.out.println("The names of our friends: " + Arrays.toString(namesArray));

        // Combining strings (concatenation)
        System.out.println("_____concatenation____");
        String word1 = "Hi ";
        String word2 = "friend!";
        String result = word1 + word2; // result = Hi friend!

        System.out.println("Word 1: " + word1);                             // output: Word 1: Hi
        System.out.println("Word 2: " + word2);                             // output: Word 2: friend!
        System.out.println("Concatenation in Result: " + result);           // output: Concatenation in Result: Hi friend!
        System.out.println("Concatenation in Print: " + word1 + word2);     // output: Concatenation in Print: Hi friend!

        // It starts with a substring
        System.out.println("_____startsWithHello____");
        boolean startsWithHello = text.startsWith("Hello");
        System.out.println("The original text: " + text);                               // output: Text: Hello world!
        System.out.println("It starts with \"Hello\": " + startsWithHello);         // output: startsWithHello: true

        // Ends with a substring
        System.out.println("_____endsWithWorld____");
        boolean endsWithWorld = text.endsWith("world!");
        System.out.println("The original text: " + text);                    // output: Text: Hello world!
        System.out.println("Ends with \"world!\": " + endsWithWorld);  // output: endsWithWorld: true

        // String truncation (first 5 characters)
        System.out.println("_____firstFiveLetters____");
        String firstFiveLetters = text.substring(0,5); // We start with 0 characters and end with 5
        System.out.println("The original text: " + text);                    // output: Text: Hello world!
        System.out.println("The first 5 letters: " + firstFiveLetters);    // output: firstFiveLetters: Hello
    }
}
