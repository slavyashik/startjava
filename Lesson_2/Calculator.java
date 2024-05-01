/**
 * Урок 2.
 */
public class Calculator {
    public void calculate(double arg1, char sign, double arg2) {
        double result = 0;

        switch (sign) {
            case '+':
                result = arg1 + arg2;
                System.out.println("Результат вычисления = " + result);
                break;
            case '-':
                result = arg1 - arg2;
                System.out.println("Результат вычисления = " + result);
                break;
            case '*':
                result = arg1 * arg2;
                System.out.println("Результат вычисления = " + result);
                break;
            case '/':
                result = arg1 / arg2;
                System.out.println("Результат вычисления = " + result);
                break;
            case '%':
                result = arg1 % arg2;
                System.out.println("Результат вычисления = " + result);
                break;
            case '^':
                result = arg1;

                for (int i = 1; i < arg2; i++) {
                    result *= arg1;
                }

                System.out.println("Результат вычисления = " + result);
                break;
            default:
                System.out.println("Введенная мат. операция не поддерживается.");
                break;
        }
    }
}