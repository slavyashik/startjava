package src.com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int MAX_ATTEMPTS = 10;
    private static final int START_RANGE = 1;
    private static final int END_RANGE = 100;
    private String name;
    private int[] numbers = new int[MAX_ATTEMPTS];
    private int attempts;
    private int winsCount;

    public Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    int[] getNumbers() {
        return Arrays.copyOf(numbers, attempts);
    }

    int getAttempts() {
        return attempts;
    }

    int getWinsCount() {
        return winsCount;
    }

    void addNumber(int number) {
        if (number >= START_RANGE && number <= END_RANGE) {
            numbers[attempts++] = number;
            return;
        }

        throw new IllegalArgumentException("Ошибка: введенное число должно быть в интервале (0; 100]");
    }

    int getNumber() {
        return attempts == 0 ? numbers[attempts] : numbers[attempts - 1];
    }

    void increaseWins() {
        winsCount++;
    }

    void resetWinsCount() {
        winsCount = 0;
    }

    void clear() {
        Arrays.fill(numbers, 0, attempts, 0);
        attempts = 0;
    }
}