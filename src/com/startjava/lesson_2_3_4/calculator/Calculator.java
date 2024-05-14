package src.com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static double calculate(String inputExpression) {
        String[] args = inputExpression.split(" ");

        if (args.length > 3) {
            throw new IllegalArgumentException("Ошибка: неверный формат выражения");
        }

        int arg1;
        int arg2;
        char sign;

        try {
            arg1 = Integer.parseInt(args[0]);
            arg2 = Integer.parseInt(args[2]);
            sign = args[1].charAt(0);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("Ошибка: неверный формат чисел");
        }

        if (arg1 <= 0 || arg2 <= 0) {
            throw new IllegalArgumentException("Ошибка: числа должны быть положительными и целыми");
        }

        return switch (sign) {
            case '+' -> arg1 + arg2;
            case '-' -> arg1 - arg2;
            case '*' -> arg1 * arg2;
            case '/' -> (double) arg1 / arg2;
            case '%' -> arg1 % arg2;
            case '^' -> Math.pow(arg1, arg2);
            default -> throw new IllegalArgumentException("Ошибка: знак " + sign + " не поддерживается");
        };
    }
}