package OOP.basics.Book;

public class Book {
    String name;
    String author;
    int pages;
    boolean isLearningMaterial;

    // Generate constructor (alt + insert)
    public Book(String name, String author, int pages, boolean isLearningMaterial) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.isLearningMaterial = isLearningMaterial;
    }


    public void printCountRows(){
        System.out.println("The number of lines in the book: " + this.pages * 40);
    }

    public void printCountRows(int countRowsOnPage){
        System.out.println("The number of lines in the book: " + this.pages * countRowsOnPage);
    }

    public void printInfo(){
        System.out.printf("Book \"%s\" by \"%s\" - %s \n", this.name, this.author,
                isLearningMaterial ? "This is educational material" : "This is not educational material");
        printCountRows();
    }
}
