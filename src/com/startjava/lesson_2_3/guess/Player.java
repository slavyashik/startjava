package src.com.startjava.lesson_2_3.guess;

/**
 * Урок 2.
 */
public class Player {
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setNumber(int number) {
        this.number = number;
    }

    int getNumber() {
        return number;
    }
}