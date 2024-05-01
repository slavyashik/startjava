import java.util.Scanner;

/**
 * Урок 2.
 */
public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Игра \"Угадай число\"");

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.next());

        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.next());

        boolean isActiveGame = true;

        while (isActiveGame) {
            GuessNumber game = new GuessNumber(player1, player2);
            game.startGame();

            while (true) {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                String choice = scanner.next();

                if (choice.equals("yes")) {
                    break;
                } else if (choice.equals("no")) {
                    isActiveGame = false;
                    break;
                }
            }
        }
    }
}