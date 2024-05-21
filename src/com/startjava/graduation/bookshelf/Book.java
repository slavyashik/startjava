package src.com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private int publicationYear;
    private int infoLength;

    public Book(String author, String title, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        infoLength = toString().length();
    }

    public String getTitle() {
        return title;
    }

    public int getInfoLength() {
        return infoLength;
    }

    public String toString() {
        return author + ", " + title + ", " + publicationYear;
    }
}