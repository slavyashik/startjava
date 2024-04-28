/**
 * Урок 1.
 */
public class CyclesTheme {
    /**
     * Задания на тему “Циклы: for, while, do-while”.
     */
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");

        int startRange = -10;
        int endRange = 21;

        System.out.printf("В отрезке [%d, %d] ", startRange, endRange);

        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;

        do {
            if (startRange % 2 == 0) {
                sumEvenNumbers += startRange;
            } else {
                sumOddNumbers += startRange;
            }

            startRange++;
        } while (startRange <= endRange);

        System.out.printf("сумма четных чисел = %d, а нечетных = %d%n",
                sumEvenNumbers, sumOddNumbers);

        System.out.println("\n2. Вывод чисел в порядке убывания");

        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        int min = b;

        if (max < b) {
            max = b;
        } else if (max < c) {
            max = c;
        }

        if (min > a) {
            min = a;
        } else if (min > c) {
            min = c;
        }

        for (int i = --max; i > min; i--) {
            System.out.printf("%d ", i);
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");

        int initNumber = 1234;
        int sumDigits = 0;

        while (initNumber > 0) {
            int lastDigit = initNumber % 10;
            System.out.print(lastDigit);
            sumDigits += lastDigit;
            initNumber /= 10;
        }

        System.out.println("\n" + sumDigits);

        System.out.println("\n4. Вывод чисел в несколько строк");

        startRange = 1;
        endRange = 30;
        int count = 0;

        for (int i = startRange; i < endRange; i += 2) {
            System.out.printf("%3s", i);
            count++;

            if (count == 5) {
                count = 0;
                System.out.println();
            }
        }

        while (count > 0 && count < 5) {
            System.out.printf("%3d", 0);
            count++;
        }

        System.out.println("\n5. Проверка количества числа двоек на четность/нечетность");

        initNumber = 3242592;
        int initNumberCopy = initNumber;
        int twosCount = 0;

        while (initNumberCopy > 0) {
            if (initNumberCopy % 10 == 2) {
                twosCount++;
            }

            initNumberCopy /= 10;
        }

        String even = twosCount % 2 == 0 ? "четное" : "нечетное";
        System.out.printf("В числе %d %s количество двоек - %d", initNumber, even, twosCount);

        System.out.println("\n\n6. Отображение геометрических фигур");

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }

            System.out.println();
        }

        System.out.println();

        int stringCount = 5;
        int columnCount = 5;

        while (columnCount != 0) {
            while (stringCount > 0) {
                System.out.print('#');
                stringCount--;
            }

            System.out.println();
            columnCount--;
            stringCount = columnCount;
        }

        System.out.println();

        stringCount = 0;
        columnCount = 0;
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

        for (int i = 33; i <= 47; i += 2) {
            System.out.printf("%4d %9c           %-5s%n", i, i, Character.getName(i));
        }

        for (int i = 97; i <= 121; i += 2) {
            System.out.printf("%4d %9c           %-5s%n", i, i, Character.getName(i));
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");

        initNumber = 1234321;
        initNumberCopy = initNumber;
        int invertedNumber = 0;

        while (initNumberCopy > 0) {
            int lastDigit = initNumberCopy % 10;
            invertedNumber = invertedNumber * 10 + lastDigit;
            initNumberCopy /= 10;
        }

        String checkResult = initNumber == invertedNumber ? "является" : "не является";

        System.out.printf("Число %d %s палиндромом", initNumber, checkResult);

        System.out.println("\n\n9. Проверка, является ли число счастливым");

        initNumber = 123321;
        initNumberCopy = initNumber;
        int sumLeftPart = 0;
        int sumRightPart = 0;

        for (int i = 0; i < 6; i++) {
            int lastDigit = initNumberCopy % 10;

            if (i < 3) {
                sumRightPart += lastDigit;
            } else {
                sumLeftPart += lastDigit;
            }

            initNumberCopy /= 10;
        }
        checkResult = sumRightPart == sumLeftPart ? "является" : "не является";

        System.out.printf("Число %d %s счастливым%n", initNumber, checkResult);
        System.out.printf("Сумма цифр %d = %d, а сумма %d = %d", initNumber / 1000,
                sumLeftPart, initNumber % 1000, sumRightPart);

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