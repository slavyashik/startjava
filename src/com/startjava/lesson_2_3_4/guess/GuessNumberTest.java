package src.com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Игра \"Угадай число\"");

        GuessNumber game = new GuessNumber(getPlayersNames());

        String choice = "yes";
        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                game.start();
            }

            System.out.println("\nХотите продолжить игру? [yes/no]: ");
            choice = scanner.next();
        }
    }

    private static String[] getPlayersNames() {
        String[] names = new String[GuessNumber.PLAYERS_COUNT];

        for (int i = 0; i < GuessNumber.PLAYERS_COUNT; i++) {
            System.out.print("Введите имя " + (i + 1) + " игрока: ");
            names[i] = scanner.nextLine();
        }

        return names;
    }
}