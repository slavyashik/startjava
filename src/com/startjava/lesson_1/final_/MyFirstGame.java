import java.util.Random;

/**
 * Урок 1.
 */
public class MyFirstGame {
    /**
     * Угадай число.
     */
    public static void main(String[] args) {
        Random random = new Random();
        int maxRange = 100;
        int secretNumber = random.nextInt(maxRange) + 1;
        int playerGuess = maxRange / 2;

        while (playerGuess != secretNumber) {
            if (playerGuess > secretNumber) {
                System.out.printf("Число %d больше того, что загадал компьютер%n", playerGuess);
                playerGuess--;
            } else {
                System.out.printf("Число %d меньше того, что загадал компьютер%n", playerGuess);
                playerGuess++;
            }
        }

        System.out.printf("Вы победили! Загаданное число: %d", playerGuess);
    }
}