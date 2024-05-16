package src.com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра \"Угадай число\"");

        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();

        GuessNumber game = new GuessNumber(name1, name2);
        String choice = "yes";

        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                game.start();
            }

            System.out.println("\nХотите продолжить игру? [yes/no]: ");
            choice = scanner.next();
        }
    }
}