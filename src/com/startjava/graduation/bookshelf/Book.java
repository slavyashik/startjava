package src.com.startjava.graduation.bookshelf;

public class Book {
    private final String author;
    private final String title;
    private final int publicationYear;
    private final int infoLen;

    public Book(String author, String title, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        infoLen = toString().length();
    }

    public String getTitle() {
        return title;
    }

    public int getInfoLen() {
        return infoLen;
    }

    public String toString() {
        return author + ", " + title + ", " + publicationYear;
    }
}