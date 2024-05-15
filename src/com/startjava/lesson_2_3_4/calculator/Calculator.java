package src.com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static double calculate(String inputExpression) {
        String[] args = inputExpression.split(" ");
        final int maxExpressionLength = 3;

        if (args.length > maxExpressionLength) {
            throw new IllegalArgumentException("Ошибка: неверный формат выражения");
        }

        int arg1;
        try {
            arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ошибка: Первый аргумент должен быть целым");
        }

        int arg2;
        try {
            arg2 = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ошибка: Второй аргумент должен быть целым");
        }

        if (arg1 <= 0) {
            throw new IllegalArgumentException("Ошибка: Первый аргумент должен быть положительным");
        }

        if (arg2 <= 0) {
            throw new IllegalArgumentException("Ошибка: Второй аргумент должен быть положительным");
        }

        char sign = args[1].charAt(0);

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