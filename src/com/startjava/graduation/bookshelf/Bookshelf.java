package src.com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private static final int CAPACITY = 10;
    private int booksCount;
    private int len;
    private Book[] books = new Book[CAPACITY];

    public int getCapacity() {
        return CAPACITY;
    }

    public int getBooksCount() {
        return booksCount;
    }

    public int getLen() {
        return len;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, booksCount);
    }

    public int getFreeShelfsCount() {
        return CAPACITY - booksCount;
    }

    public void add(Book book) {
        books[booksCount++] = book;
        if (book.getInfoLength() >= len) {
            refreshLen();
        }
    }

    public Book find(String title) {
        int bookNumber = findBookNumber(title);

        if (bookNumber != -1) {
            return books[bookNumber];
        }

        return null;
    }

    public boolean remove(String title) {
        int bookNumber = findBookNumber(title);

        if (bookNumber != -1) {
            int length = books[bookNumber].getInfoLength();
            System.arraycopy(books, bookNumber + 1, books, bookNumber, booksCount - bookNumber - 1);
            books[--booksCount] = null;
            if (length == len) {
                refreshLen();
            }
            return true;
        }

        return false;
    }

    public void clear() {
        Arrays.fill(books, 0, booksCount, null);
        booksCount = 0;
        len = 0;
    }

    private void refreshLen() {
        len = 0;
        for (int i = 0; i < booksCount; i++) {
            len = Math.max(books[i].getInfoLength(), len);
        }
    }

    private int findBookNumber(String title) {
        int bookNumber = -1;

        for (int i = 0; i < booksCount; i++) {
            if (books[i].getTitle().equals(title)) {
                bookNumber = i;
            }
        }

        return bookNumber;
    }
}