import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 3;
        int result;
        char sign;
        Scanner inputSign = new Scanner(System.in);

        System.out.print("Какую операцию выполнить: ");
        sign = inputSign.nextLine().charAt(0);

        if (sign == '+') {
            result = firstNumber + secondNumber;
            System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
        } else if (sign == '-') {
            result = firstNumber - secondNumber;
            System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
        } else if (sign == '*') {
            result = firstNumber * secondNumber;
            System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
        } else if (sign == '/') {
            result = firstNumber / secondNumber;
            System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
        } else if (sign == '%') {
            result = firstNumber % secondNumber;
            System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
        } else if (sign == '^') {
            result = firstNumber;

            for (int i = 1; i < secondNumber; i++) {
                result = result * firstNumber;
            }

            System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
        } else {
            System.out.println("Неизвестная операция");
        }
    }
}