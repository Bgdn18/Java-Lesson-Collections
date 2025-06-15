package OOP.basics.Book;

public class Task {
    public static void main(String[] args) {
            /*
            Create a Book class with attributes: book title, author name, number of pages, documentary (yes/no)
            Book class methods:
            1. Output the total number of lines in the book - no arguments:
            Result: Outputs the number of pages * 40
            2. Output the total number of lines in the book (number of lines per page)
            Result: Prints the number of pages * number of lines per page.
            3. Output book information without arguments
            Result: [Book title] from [Author name] - [non-fiction/non-fiction]
            */

        Book book = new Book("Java Complete Guide", "Herbert Schildt", 1344, true);
        book.printInfo();
    }
}
