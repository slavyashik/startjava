/**
 * Урок 1.
 */
public class CyclesTheme {
    /**
     * Задания на тему “Циклы: for, while, do-while”.
     */
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");

        int a = -10;
        int b = 21;
        int evenNumbersCounter = 0;
        int otherNumbersCounter = 0;
        int counter = a;

        do {
            if (counter % 2 == 0) {
                evenNumbersCounter++;
            } else {
                otherNumbersCounter++;
            }

            counter++;
        } while (counter <= b);

        System.out.printf("В отрезке [%d, %d] сумма четных чисел = %d, а нечетных = %d%n",
                a, b, evenNumbersCounter, otherNumbersCounter);

        System.out.println("\n2. Вывод чисел в порядке убывания");

        a = 10;
        b = 5;
        int c = -1;
        int max = 0;
        int min = 0;

        if (max < a) {
            max = a;
        } else if (max < b) {
            max = b;
        } else if (max < c) {
            max = c;
        }

        if (min > a) {
            min = a;
        } else if (min > b) {
            min = b;
        } else if (min > c) {
            min = c;
        }

        for (int i = --max; i > min; i--) {
            System.out.printf("%d ", i);
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

        number = 3242592;
        int temp = number;
        int twosCounter = 0;

        while (temp > 0) {
            if (temp % 10 == 2) {
                twosCounter++;
            }

            temp /= 10;
        }

        String even = twosCounter % 2 == 0 ? "четное" : "нечетное";
        System.out.printf("В числе %d %s количество двоек - %d", number, even, twosCounter);

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

        number = 1234321;
        counter = number;
        int invertedNumber = 0;

        while (counter > 0) {
            int lastDigit = counter % 10;
            invertedNumber = invertedNumber * 10 + lastDigit;
            counter /= 10;
        }

        String checkResult = number == invertedNumber ? "является" : "не является";

        System.out.printf("Число %d %s палиндромом", number, checkResult);

        System.out.println("\n\n9. Проверка, является ли число счастливым");

        number = 123321;
        int sumFirstPart = 0;
        int sumLastPart = 0;
        temp = number;
        int lastDigit = 0;

        for (int i = 0; i < 6; i++) {
            lastDigit = temp % 10;

            if (i < 3) {
                sumLastPart += lastDigit;
            } else {
                sumFirstPart += lastDigit;
            }

            temp /= 10;
        }
        checkResult = sumLastPart == sumFirstPart ? "является" : "не является";

        System.out.printf("Число %d %s счастливым%n", number, checkResult);
        System.out.printf("Сумма цифр %d = %d, а сумма %d = %d", number / 1000,
                sumFirstPart, number % 1000, sumLastPart);

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