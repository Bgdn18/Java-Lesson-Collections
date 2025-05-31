package String;

public class StringPractice {
    public static void main(String[] args)
    {
        //Select text starting from 11 characters to the end of the line, convert to lowercase,
        //split the line into an array by space. Display each word from the array and the length of the string of this word

        String text = "My name is Bogdan Khorolsky";
        String[] splitArray = text.substring(11).toLowerCase().split(" ");
        for (String word : splitArray) {
            System.out.println(word);
            System.out.println(word.length());
        }
    }
}