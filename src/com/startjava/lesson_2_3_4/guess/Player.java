package src.com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int attempts;

    public Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setName() {
        this.name = name;
    }

    void addNumber(int number) {
        this.numbers[attempts++] = number;
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