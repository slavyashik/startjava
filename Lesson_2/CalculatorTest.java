import java.util.Scanner;

/**
 * Урок 2.
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean isActive = true;

        System.out.println("Добро пожаловать в калькулятор!");

        while (isActive) {
            System.out.print("Введите первое число: ");
            double arg1 = scanner.nextDouble();

            System.out.print("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            double arg2 = scanner.nextDouble();

            calculator.calculate(arg1, sign, arg2);

            while (true) {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                String choice = scanner.next();

                if (choice.equals("yes")) {
                    break;
                } else if (choice.equals("no")) {
                    isActive = false;
                    break;
                }
            }
        }
    }
}