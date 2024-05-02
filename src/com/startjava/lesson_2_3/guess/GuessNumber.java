package src.com.startjava.lesson_2_3.guess;

import java.util.Random;
import java.util.Scanner;

/**
 * Урок 2.
 */
public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNumber;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        Random random = new Random();
        this.player1 = player1;
        this.player2 = player2;
        this.secretNumber = random.nextInt(100) + 1;
    }

    void start() {
        while (true) {
            guessNumber(player1);
            if (isGuessed(player1)) {
                break;
            }

            guessNumber(player2);
            if (isGuessed(player2)) {
                break;
            }
        }
    }

    private void guessNumber(Player player) {
        System.out.print(player.getName() + " предполагает: ");
        player.setNumber(scanner.nextInt());
        System.out.println();
    }

    private boolean isGuessed(Player player) {
        if (player.getNumber() == secretNumber) {
            System.out.println(player.getName() + " угадал число " + player.getNumber());
            return true;
        }

        if (player.getNumber() > secretNumber) {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер");
        }

        return false;
    }
}