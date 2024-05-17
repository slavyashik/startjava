package src.com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    public static final int MAX_ATTEMPTS = 10;
    private int[] numbers = new int[MAX_ATTEMPTS];
    private int attempts;
    private int roundsWon;

    public Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void addNumber(int number) {
        if (number > 0 && number <= 100) {
            numbers[attempts++] = number;
        } else {
            throw new IllegalArgumentException("Ошибка: введенное число должно быть в интервале (0; 100]");
        }
    }

    int getNumber() {
        return attempts == 0 ? numbers[attempts] : numbers[attempts - 1];
    }

    int[] getNumbers() {
        return Arrays.copyOf(numbers, attempts);
    }

    int getAttempts() {
        return attempts;
    }

    void wonRound() {
        roundsWon++;
    }

    int getRoundsWon() {
        return roundsWon;
    }

    void resetRounds() {
        roundsWon = 0;
    }

    void clear() {
        Arrays.fill(numbers, 0, attempts, 0);
        attempts = 0;
    }
}