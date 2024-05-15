package src.com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор!");
        Scanner scanner = new Scanner(System.in);
        String choice = "yes";

        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                System.out.print("Введите выражение: ");
                String inputExpression = scanner.nextLine();
                try {
                    printResult(Calculator.calculate(inputExpression), inputExpression);
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
            choice = scanner.nextLine();
        }
    }

    private static void printResult(double result, String inputExpression) {
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.printf("%s = %s", inputExpression, df.format(result));
    }
}