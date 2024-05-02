package src.com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

/**
 * Урок 2.
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в калькулятор!");

        String choice = "";
        while (!choice.equals("no")) {
            System.out.print("Введите первое число: ");
            double arg1 = scanner.nextDouble();

            System.out.print("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            double arg2 = scanner.nextDouble();

            calculator.calculate(arg1, sign, arg2);

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                choice = scanner.next();
            } while (!choice.equals("yes") && !choice.equals("no"));
        }
    }
}