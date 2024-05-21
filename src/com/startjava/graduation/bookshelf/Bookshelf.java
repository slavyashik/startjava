package src.com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    public static final int CAPACITY = 10;
    private int booksCount;
    private int lenShelves;
    private final Book[] books = new Book[CAPACITY];

    public int getBooksCount() {
        return booksCount;
    }

    public int getLenShelves() {
        return lenShelves;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, booksCount);
    }

    public int getFreeShelvesCount() {
        return CAPACITY - booksCount;
    }

    public void add(Book book) {
        books[booksCount++] = book;
        if (book.getInfoLen() > lenShelves) {
            updateLen();
        }
    }

    public Book find(String title) {
        int index = findIndex(title);
        return index != -1 ? books[index] : null;
    }

    public boolean remove(String title) {
        int index = findIndex(title);

        if (index != -1) {
            int len = books[index].getInfoLen();
            System.arraycopy(books, index + 1, books, index, booksCount - index - 1);
            books[--booksCount] = null;
            if (len == lenShelves) {
                updateLen();
            }
            return true;
        }

        return false;
    }

    public void clear() {
        Arrays.fill(books, 0, booksCount, null);
        booksCount = 0;
        lenShelves = 0;
    }

    private void updateLen() {
        lenShelves = 0;
        for (int i = 0; i < booksCount; i++) {
            lenShelves = Math.max(books[i].getInfoLen(), lenShelves);
        }
    }

    private int findIndex(String title) {
        for (int i = 0; i < booksCount; i++) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }

        return -1;
    }
}