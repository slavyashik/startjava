package src.com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    static Scanner scanner = new Scanner(System.in);
    static Bookshelf bookshelf = new Bookshelf();

    public static void main(String[] args) {
        String choice = "";
        while (!choice.equals("5")) {
            if (!choice.equals("")) {
                System.out.print("\nДля продолжения нажмите Enter.\n");
                scanner.nextLine();
            }

            printBookshelf();
            printMenu();
            System.out.print("Выберите операцию: ");
            choice = scanner.nextLine();
            runOperation(choice);
        }
    }

    private static void printBookshelf() {
        int count = bookshelf.getBooksCount();
        int len = bookshelf.getLenShelves();

        if (count > 0) {
            System.out.println("\nВ шкафу книг - " + count + ", свободно полок - " +
                    bookshelf.getFreeShelvesCount() + "\n");

            for (Book book : bookshelf.getBooks()) {
                System.out.println("|" + book + " ".repeat(len - book.getInfoLen()) + "|");
                System.out.println("|" + "-".repeat(len) + "|");
            }

            System.out.println("|" + " ".repeat(len) + "|");
            return;
        }

        System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу.");
    }

    private static void printMenu() {
        String menu = """
                \n1. Добавить книгу.
                2. Удалить книгу.
                3. Найти книгу.
                4. Очистить шкаф.
                5. Завершить.
                """;

        System.out.println(menu);
    }

    private static void runOperation(String choice) {
        switch (choice) {
            case "0" -> doDemoBooks();
            case "1" -> addBook();
            case "2" -> removeBook();
            case "3" -> findBook();
            case "4" -> clear();
            case "5" -> System.out.println("\nЗавершили!");
            default -> System.out.println("\nОшибка: введен некорректный номер.");
        }
    }

    private static void addBook() {
        if (bookshelf.getBooksCount() >= Bookshelf.CAPACITY) {
            System.out.println("Шкаф полон.");
            return;
        }

        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine();

        String title = enterTitle();

        System.out.print("Введите год публикации книги: ");
        int yearPublishing = scanner.nextInt();

        Book book = new Book(author, title, yearPublishing);
        bookshelf.add(book);
    }

    private static void removeBook() {
        if (bookshelf.remove(enterTitle())) {
            System.out.println("Удалена");
        } else {
            System.out.println("Книги с таким названием нет");
        }
    }

    private static void findBook() {
        Book book = bookshelf.find(enterTitle());

        if (book == null) {
            System.out.println("Книги с таким названием нет");
        } else {
            System.out.println(book);
        }
    }

    private static void clear() {
        bookshelf.clear();
        System.out.println("Все книги удалены!");
    }

    private static String enterTitle() {
        System.out.print("Введите название книги: ");
        return scanner.nextLine();
    }

    private static void doDemoBooks() {
        Book book = new Book("Кодирович", "Научиться кодить правильно", 1982);
        bookshelf.add(book);
        book = new Book("Петухов", "Научиться петь", 1983);
        bookshelf.add(book);
        book = new Book("Быков", "Научиться есть", 1984);
        bookshelf.add(book);
        book = new Book("Зеков", "Научиться сидеть", 1985);
        bookshelf.add(book);
        book = new Book("Конев", "Научиться бегать", 1986);
        bookshelf.add(book);
    }
}