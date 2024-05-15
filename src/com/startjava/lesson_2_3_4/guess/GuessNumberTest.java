package src.com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра \"Угадай число\"");

        System.out.print("Введите имя первого игрока: ");
        String playerName1 = scanner.nextLine();
        System.out.print("Введите имя второго игрока: ");
        String playerName2 = scanner.nextLine();

        GuessNumber game = new GuessNumber(playerName1, playerName2);
        String choice = "yes";

        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                game.start();
            }

            System.out.println("Хотите продолжить игру? [yes/no]: ");
            choice = scanner.next();
        }
    }
}