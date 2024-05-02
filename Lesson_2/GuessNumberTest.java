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

        String choice = "";
        while (!choice.equals("no")) {
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();

            choice = "";
            while (!choice.equals("yes") && !choice.equals("no")) {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                choice = scanner.next();
            }
        }
    }
}