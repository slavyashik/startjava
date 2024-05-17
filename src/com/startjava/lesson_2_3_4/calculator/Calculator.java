package src.com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static final int ARGS_LIMIT = 3;

    public static double calculate(String inputExpression) {
        String[] args = inputExpression.split(" ");

        if (args.length != ARGS_LIMIT) {
            throw new IllegalArgumentException("Ошибка: неверный формат выражения");
        }

        int arg1 = checkArg(args[0]);
        int arg2 = checkArg(args[2]);
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

    private static int checkArg(String arg) {
        int number;

        try {
            number = Integer.parseInt(arg);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ошибка: Аргументы должны быть целыми");
        }

        if (number <= 0) {
            throw new IllegalArgumentException("Ошибка: Аргумент должны быть положительными");
        }

        return number;
    }
}