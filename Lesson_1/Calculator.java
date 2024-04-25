import java.util.Random;

/**
 * Урок 1.
 */
public class Calculator {
    /**
     * Калькулятор.
     */
    public static void main(String[] args) {
        Random random = new Random();
        int firstNumber = random.nextInt(1, 10);
        int secondNumber = random.nextInt(1, 10);
        int signNumber = random.nextInt(1, 60);
        int result = 0;
        char sign = '+';

        if (signNumber > 50) {
            result = firstNumber - secondNumber;
            sign = '-';
        } else if (signNumber > 40) {
            result = firstNumber * secondNumber;
            sign = '*';
        } else if (signNumber > 30) {
            result = firstNumber / secondNumber;
            sign = '/';
        } else if (signNumber > 20) {
            result = firstNumber % secondNumber;
            sign = '%';
        } else if (signNumber > 10) {
            result = firstNumber;
            sign = '^';

            for (int i = 1; i < secondNumber; i++) {
                result *= firstNumber;
            }
        } else {
            result = firstNumber + secondNumber;
        }

        System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
    }
}