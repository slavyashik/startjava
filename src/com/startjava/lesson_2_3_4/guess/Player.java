package src.com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    public static final int MAX_ATTEMPTS = 10;
    private int[] numbers = new int[MAX_ATTEMPTS];
    private int attempts;

    public Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void addNumber(int number) {
        numbers[attempts++] = number;
    }

    int getNumber() {
        return numbers[attempts - 1];
    }

    int[] getNumbers() {
        return Arrays.copyOf(numbers, attempts);
    }

    int getAttempts() {
        return attempts;
    }

    void clear() {
        Arrays.fill(numbers, 0, attempts, 0);
        attempts = 0;
    }
}