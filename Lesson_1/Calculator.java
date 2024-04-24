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
      sign = '-';
    } else if (signNumber > 40) {
      sign = '*';
    } else if (signNumber > 30) {
      sign = '/';
    } else if (signNumber > 20) {
      sign = '%';
    } else if (signNumber > 10) {
      sign = '^';
    }

    if (sign == '+') {
      result = firstNumber + secondNumber;
    } else if (sign == '-') {
      result = firstNumber - secondNumber;
    } else if (sign == '*') {
      result = firstNumber * secondNumber;
    } else if (sign == '/') {
      result = firstNumber / secondNumber;
    } else if (sign == '%') {
      result = firstNumber % secondNumber;
    } else {
      result = firstNumber;
      for (int i = 1; i < secondNumber; i++) {
        result = result * firstNumber;
      }
    }

    System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
  }
}