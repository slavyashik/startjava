package src.com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNumber;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(String playerName1, String playerName2) {
        this.player1 = new Player(playerName1);
        this.player2 = new Player(playerName2);
    }

    void start() {
        generateNumber();
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");

        while (hasAttempts(player1) && hasAttempts(player2)) {
            guessNumber(player1);
            if (isGuessed(player1)) {
                break;
            }

            guessNumber(player2);
            if (isGuessed(player2)) {
                break;
            }
        }

        printAllNumbers(player1);
        printAllNumbers(player2);
        player1.clear();
        player2.clear();
    }

    private void generateNumber() {
        Random random = new Random();
        this.secretNumber = random.nextInt(100) + 1;
    }

    private void guessNumber(Player player) {
        System.out.print(player.getName() + " предполагает: ");
        player.addNumber(scanner.nextInt());
    }

    private boolean isGuessed(Player player) {
        int guess = player.getNumber();

        if (guess == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал " +
                    guess + " с " + player.getAttempts() + " попытки");
            return true;
        }

        if (guess > secretNumber) {
            System.out.println("Число " + guess + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + guess + " меньше того, что загадал компьютер");
        }

        return false;
    }

    private boolean hasAttempts(Player player) {
        if (player.getAttempts() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
            return false;
        }

        return true;
    }

    private void printAllNumbers(Player player) {
        System.out.print("Числа введённые " + player.getName() + ": ");

        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }

        System.out.println();
    }
}