package src.com.startjava.lesson_2_3_4.calculator;

/**
 * Урок 2.
 */
public class Calculator {
    public double calculate(String inputLine) {
        double result = 0;
        String[] args = inputLine.split(" ");
        int arg1 = Integer.parseInt(args[0]);
        char sign = args[1].charAt(0);
        int arg2 = Integer.parseInt(args[2]);

        switch (sign) {
            case '+':
                result = arg1 + arg2;
                break;
            case '-':
                result = arg1 - arg2;
                break;
            case '*':
                result = arg1 * arg2;
                break;
            case '/':
                result = (double) arg1 / arg2;
                break;
            case '%':
                result = arg1 % arg2;
                break;
            case '^':
                result = Math.pow(arg1, arg2);
                break;
            default:
                System.out.println("Ошибка: знак " + sign + " не поддерживается.");
                return Double.NaN;
        }

        if (result == (int) result) {
            return (int) result;
        } else {
            return Math.round(result * 1000.0) / 1000.0;
        }
    }
}