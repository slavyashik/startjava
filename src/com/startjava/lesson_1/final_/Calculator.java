package src.com.startjava.lesson_1.final_;

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
        int arg1 = random.nextInt(1, 10);
        int arg2 = random.nextInt(1, 10);
        int result = 0;
        char sign = '+';

        if (sign == '+') {
            result = arg1 + arg2;
        } else if (sign == '-') {
            result = arg1 - arg2;
        } else if (sign == '*') {
            result = arg1 * arg2;
        } else if (sign == '/') {
            result = arg1 / arg2;
        } else if (sign == '%') {
            result = arg1 % arg2;
        } else if (sign == '^') {
            result = arg1;

            for (int i = 1; i < arg2; i++) {
                result *= arg1;
            }
        }

        System.out.println(arg1 + " " + sign + " " + arg2 + " = " + result);
    }
}