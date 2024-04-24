/**
 * Урок 1.
 */
public class CyclesTheme {
    /**
     * Задания на тему “Циклы: for, while, do-while”.
     */
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");

        int firstNumber = -10;
        int lastNumber = 21;
        int evenNumbersCounter = 0;
        int otherNumbersCounter = 0;
        int counter = firstNumber;

        do {
            if (counter % 2 == 0) {
                evenNumbersCounter++;
            } else {
                otherNumbersCounter++;
            }

            counter++;
        } while (counter <= lastNumber);

        System.out.println("В отрезке [" + firstNumber + ", " + lastNumber +
                "] сумма четных чисел = " + evenNumbersCounter + ", а нечетных = " +
                otherNumbersCounter);

        System.out.println("\n2. Вывод чисел в порядке убывания");

        int numberOne = 10;
        int numberTwo = 5;
        int numberThree = -1;
        int max = 0;
        int min = 0;

        // ищем максимальное число
        if (max < numberOne) {
            max = numberOne;
        } else if (max < numberTwo) {
            max = numberTwo;
        } else if (max < numberThree) {
            max = numberThree;
        }

        // ищем минимальное число
        if (min > numberOne) {
            min = numberOne;
        } else if (min > numberTwo) {
            min = numberTwo;
        } else if (min > numberThree) {
            min = numberThree;
        }

        for (int i = --max; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");

        int number = 1234;
        int digitCounter = 4;
        int digitsSum = 0;

        while (digitCounter > 0) {
            int lastDigit = number % 10;
            System.out.print(lastDigit);

            digitsSum += number % 10;
            number /= 10;
            digitCounter--;
        }

        System.out.println("\n" + digitsSum);

        System.out.println("\n4. Вывод чисел в несколько строк");

        int startNumber = 1;
        int endNumber = 30;
        int count = 0;

        for (int i = startNumber; i < endNumber; i++) {
            if (i % 2 > 0) {
                System.out.printf("%3s", i);
                count++;
            }

            if (count == 5) {
                count = 0;
                System.out.println();
            }
        }

        while (count < 5 && count != 0) {
            System.out.printf("%3s", "0");
            count++;
        }

        System.out.println("\n5. Проверка количества числа двоек на четность/нечетность");

        int incomingNumber = 3242592;
        int temp = incomingNumber;
        int twosCounter = 0;

        while (temp > 0) {
            if (temp % 10 == 2) {
                twosCounter++;
            }

            temp /= 10;
        }

        System.out.printf("В числе %d %s количество двоек - %d", incomingNumber,
                (twosCounter % 2 == 0 ? "четное" : "нечетное"), twosCounter);

        System.out.println("\n\n6. Отображение геометрических фигур");

        for (int x = 0; x <= 5; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.print('*');
            }

            System.out.println();
        }

        System.out.println();

        int lineCounter = 5;
        int columnCounter = 5;

        while (columnCounter != 0) {
            while (lineCounter > 0) {
                System.out.print('#');
                lineCounter--;
            }

            System.out.println();
            columnCounter--;
            lineCounter = columnCounter;
        }


        System.out.println();
        int stringCount = 0;
        int columnCount = 0;
        int charsInStringCounter = 0;

        do {
            stringCount++;

            if (stringCount <= 3) {
                charsInStringCounter = stringCount;
                columnCount++;
            } else {
                charsInStringCounter = --columnCount;
            }

            do {
                System.out.print('$');
                charsInStringCounter--;
            } while (charsInStringCounter > 0);

            System.out.println();
        } while (stringCount < 5);

        System.out.println("\n7. Отображение ASCII-символов");

        System.out.printf("%-8s %-10s %-10s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");

        for (int i = 33; i <= 47; i++) {
            if (i % 2 > 0) {
                System.out.printf("%4d %9c      %-1s%n", i, (char) i, Character.getName(i));
            }
        }

        for (int i = 97; i <= 121; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4d %9c      %-1s%n", i, (char) i, Character.getName(i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");

        int inputNumber = 1234321;
        int tempNumber = inputNumber;
        int invertedNumber = 0;
        int lastDigit = 0;

        while (tempNumber > 0) {
            lastDigit = tempNumber % 10;
            invertedNumber = invertedNumber * 10 + lastDigit;
            tempNumber /= 10;
        }

        System.out.printf("Число %d %s палиндромом", inputNumber,
                (inputNumber == invertedNumber ? "является" : "не является"));

        System.out.println("\n\n9. Проверка, является ли число счастливым");

        int luckyNumber = 123321;
        int sumFirstPart = 0;
        int sumLastPart = 0;
        int luckyNumberTemp = luckyNumber;
        int lastDigit1 = 0;

        for (int i = 0; i < 6; i++) {
            lastDigit1 = luckyNumberTemp % 10;

            if (i < 3) {
                sumLastPart += lastDigit1;
            } else {
                sumFirstPart += lastDigit1;
            }

            luckyNumberTemp /= 10;
        }

        System.out.printf("Число %d %s счастливым%n", luckyNumber,
                (sumLastPart == sumFirstPart ? "является" : "не является"));
        System.out.printf("Сумма цифр %d = %d, а сумма %d = %d", luckyNumber / 1000,
                sumFirstPart, luckyNumber % 1000, sumLastPart);

        System.out.println("\n\n10. Отображение таблицы умножения Пифагора");

        System.out.print("   |");

        for (int i = 1; i < 10; i++) {
            System.out.printf("%3d", i);
        }

        System.out.printf("%n---|---------------------------%n");

        for (int i = 1; i < 10; i++) {
            System.out.printf("%2d |", i);

            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }

            System.out.println();
        }
    }
}
