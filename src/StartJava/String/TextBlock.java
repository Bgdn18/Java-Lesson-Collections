package StartJava.String;

public class TextBlock {
    public static void main(String[] args)
    {
        // Traditional string with escape sequences
        String text1 = "Hello\nWorld!\n";
        System.out.println("Text1: " + text1);

        // Modern text block
        String text2 = """
                       Hello
                       World!
                       """;
        System.out.println("Text2: " + text2);
    }
}
