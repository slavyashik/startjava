package src.com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

/**
 * Урок 2.
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в калькулятор!");

        String choice = "yes";
        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                System.out.print("Введите выражение: ");
                String inputLine = scanner.nextLine();

                double result = calculator.calculate(inputLine);
                if (!Double.isNaN(result)) {
                    System.out.println(inputLine + " = " + result);
                }
            }

            System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
            choice = scanner.nextLine();
        }
    }
}