package src.com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static final int PLAYERS_COUNT = 3;
    private static final int ROUND_COUNT = 3;
    private Player[] players = new Player[PLAYERS_COUNT];
    private int secretNumber;
    Scanner scanner = new Scanner(System.in);
    private boolean isRoundOver;
    private Random random = new Random();
    private int round;

    public GuessNumber(String[] names) {
        for (int i = 0; i < PLAYERS_COUNT; i++) {
            players[i] = new Player(names[i]);
        }
    }

    void start() {
        do {
            isRoundOver = false;
            System.out.println("\nРаунд: " + ++round);
            generateNumber();
            shufflePlayers();

            System.out.println("Игра началась! У каждого игрока по 10 попыток.\n");

            while (!isRoundOver) {
                for (int i = 0; i < PLAYERS_COUNT; i++) {
                    if (hasAttempts(players[i])) {
                        guessNumber(players[i]);

                        if (isGuessed(players[i])) {
                            break;
                        }
                    }
                }
            }

            printAllNumbers();
        } while (!isGameEnded());
    }

    private void generateNumber() {
        secretNumber = random.nextInt(100) + 1;
    }

    private void guessNumber(Player player) {
        boolean retry = true;
        do {
            System.out.print(player.getName() + " предполагает: ");
            try {
                player.addNumber(scanner.nextInt());
                retry = false;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        } while (retry);
    }

    private boolean isGuessed(Player player) {
        int guess = player.getNumber();

        if (guess == secretNumber) {
            System.out.println("\nИгрок " + player.getName() + " угадал " +
                    guess + " с " + player.getAttempts() + " попытки");
            isRoundOver = true;
            player.wonRound();
            return true;
        }

        System.out.printf("Число %d %s того, что загадал компьютер\n\n",
                guess, guess > secretNumber ? "больше" : "меньше");
        return false;
    }

    private boolean hasAttempts(Player player) {
        if (player.getAttempts() == Player.MAX_ATTEMPTS) {
            System.out.println("У " + player.getName() + " закончились попытки");
            isRoundOver = true;
            return false;
        }

        return true;
    }

    private void printAllNumbers() {
        System.out.println();
        for (Player player : players) {
            if (player.getAttempts() != 0) {
                System.out.print("Числа введённые " + player.getName() + ": ");

                for (int number : player.getNumbers()) {
                    System.out.print(number + " ");
                }

                System.out.println();
                player.clear();
            }
        }
    }

    private void shufflePlayers() {
        System.out.println("Определяю порядок игроков...");

        for (int i = PLAYERS_COUNT - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Player temp = players[i];
            players[i] = players[index];
            players[index] = temp;
        }

        System.out.println("Первым начнёт " + players[0].getName());
    }

    private boolean isGameEnded() {
        if (round == ROUND_COUNT) {
            int maxRoundsWon = 0;
            int winnerIndex = 0;
            boolean isDraw = false;

            for (int i = 0; i < PLAYERS_COUNT; i++) {
                int roundsWon = players[i].getRoundsWon();
                if (roundsWon > maxRoundsWon) {
                    maxRoundsWon = roundsWon;
                    winnerIndex = i;
                    isDraw = false;
                } else if (roundsWon == maxRoundsWon) {
                    isDraw = true;
                }
            }

            System.out.printf("\nПо итогам " + ROUND_COUNT + "-х раундов игры ");
            System.out.println(isDraw ? "ничья." : "победил " + players[winnerIndex].getName() +
                    ", выиграв " + players[winnerIndex].getRoundsWon() + " раунда");
            reset();
            return true;
        }

        return false;
    }

    private void reset() {
        round = 0;

        for (Player player : players) {
            player.resetRounds();
        }
    }
}