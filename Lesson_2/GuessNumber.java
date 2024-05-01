import java.util.Random;
import java.util.Scanner;

/**
 * Урок 2.
 */
public class GuessNumber {
    private Player player1;
    private Player player2;

    private int secretNumber;
    private boolean isEnd = false;

    public GuessNumber(Player player1, Player player2) {
        Random random = new Random();

        this.player1 = player1;
        this.player2 = player2;
        this.secretNumber = random.nextInt(100) + 1;
    }

    void startGame() {
        while (!isEnd) {
            playerGuess(player1);
            playerGuess(player2);
        }
    }

    private void playerGuess(Player player) {
        if (!isEnd) {
            Scanner scanner = new Scanner(System.in);

            System.out.print(player.getName() + " предполагает: ");
            player.setNumber(scanner.nextInt());
            System.out.println();

            checkGuess(player);
        }
    }

    private void checkGuess(Player player) {
        if (player.getNumber() == secretNumber) {
            System.out.println(player.getName() + " угадал число " + player.getNumber());
            isEnd = true;
        } else if (player.getNumber() > secretNumber) {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер");
        }
    }
}