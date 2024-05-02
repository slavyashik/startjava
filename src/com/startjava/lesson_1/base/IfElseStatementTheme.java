package src.com.startjava.lesson_1.base;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Урок 1.
 */
public class IfElseStatementTheme {
    /**
     * Задания на тему “Переменные: примитивные типы данных”.
     */
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");

        boolean maleGender = true;

        if (!maleGender) {
            System.out.println("Женщина");
        } else {
            System.out.println("Мужик");
        }

        int age = 32;

        if (age > 18) {
            System.out.println("Взрослый Мужик");
        } else {
            System.out.println("пока не мужик");
        }

        double height = 1.99;

        if (height < 1.8) {
            System.out.println("Теннисист");
        } else {
            System.out.println("Баскетболист");
        }

        String name = "Slava";
        char firstChar = name.charAt(0);

        if (firstChar == 'M') {
            System.out.println("Совпадает");
        } else if (firstChar == 'I') {
            System.out.println("Совпадает");
        } else {
            System.out.println("Совпадений нет");
        }

        System.out.println("\n2. Поиск большего числа");

        int a = 123;
        int b = 321;

        if (a > b) {
            System.out.println("Число " + a + " больше " + b);
        } else if (a == b) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Число " + b + " больше " + a);
        }

        System.out.println("\n3. Проверка числа");

        int checkedNumber = 113;

        if (checkedNumber == 0) {
            System.out.println("Число равно 0");
        } else {
            String resultEven = "нечетным";

            if (checkedNumber % 2 == 0) {
                resultEven = "четным";
            }

            String resultPositive = "отрицательным";

            if (checkedNumber > 0) {
                resultPositive = "положительным";
            }

            System.out.println(checkedNumber + " является " + resultPositive + " и " + resultEven);
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");

        a = 123;
        b = 224;

        int hundredsA = a / 100;
        int tensA = a / 10 % 10;
        int onesA = a % 10;
        int hundredsB = b / 100;
        int tensB = b / 10 % 10;
        int onesB = b % 10;

        boolean hasEqualDigits = hundredsA != hundredsB || tensA != tensB || onesA != onesB;

        if (hasEqualDigits) {
            System.out.println("Исходные числа: " + a + " и " + b);

            if (onesA == onesB) {
                System.out.println("Цифры " + onesA + " и " + onesB + " первого разряда равны");
            }

            if (tensA == tensB) {
                System.out.println("Цифры " + tensA + " и " + tensB + " второго разряда равны");
            }

            if (hundredsA == hundredsB) {
                System.out.println("Цифры " + hundredsA + " и " +
                        hundredsB + " третьего разряда равны");
            }
        } else {
            System.out.println("Все цифры в разрядах двух чисел разные.");
        }

        System.out.println("\n5. Определение символа по его коду");

        char charCode = '\u0057';
        boolean isDigit = charCode >= '0' && charCode <= '9';
        boolean isUpperCase = charCode >= 'A' && charCode <= 'Z';
        boolean isLowerCase = charCode >= 'a' && charCode <= 'z';


        if (isDigit) {
            System.out.println("Символ " + charCode + " является цифрой.");
        } else if (isUpperCase) {
            System.out.println("Символ " + charCode + " является большой буквой");
        } else if (isLowerCase) {
            System.out.println("Символ " + charCode + " является маленькой буквой");
        } else {
            System.out.println("Символ " + charCode + " не является ни буквой, ни цифрой.");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");

        var amountDeposit = new BigDecimal("321123.59");
        var annualIncome = new BigDecimal("0.0");
        double discount = 0.1;

        if (amountDeposit.compareTo(BigDecimal.valueOf(100000)) < 0) {
            discount = 0.05;
        } else if (amountDeposit.compareTo(BigDecimal.valueOf(100000)) >= 0 &&
                amountDeposit.compareTo(BigDecimal.valueOf(300000)) <= 0) {
            discount = 0.07;
        }

        annualIncome = amountDeposit.multiply(BigDecimal.valueOf(discount))
                .setScale(2, RoundingMode.HALF_UP);

        var amountDepositTotal = amountDeposit.add(annualIncome);

        System.out.printf("Сумма вклада: %.2f%n", amountDeposit);
        System.out.printf("Сумма начисленных %% за год: %.2f%n", annualIncome);
        System.out.printf("Итоговая сумма с %%: %.2f%n", amountDepositTotal);

        System.out.println("\n7. Определение оценки по предметам");

        double percentHistory = 59;
        double markHistory = 2;

        if (percentHistory > 91) {
            markHistory = 5;
        } else if (percentHistory > 73) {
            markHistory = 4;
        } else if (percentHistory > 60) {
            markHistory = 3;
        }

        double markProgramming = 2;
        double percentProgramming = 92;

        if (percentProgramming > 91) {
            markProgramming = 5;
        } else if (percentProgramming > 73) {
            markProgramming = 4;
        } else if (percentProgramming > 60) {
            markProgramming = 3;
        }

        double avgMarkScore = (markHistory + markProgramming) / 2;
        double avgPercentScore = (percentHistory + percentProgramming) / 2;

        System.out.println("Оценка по истории: " + markHistory);
        System.out.println("Оценка по программированию: " + markProgramming);
        System.out.println("Средний бал по предметам: " + avgMarkScore);
        System.out.println("Средний процент по предметам: " + avgPercentScore);

        System.out.println("\n8. Расчет годовой прибыли");

        var incomePerMonth = new BigDecimal("15025.233");
        var priceOfRent = new BigDecimal("5123.018");
        var costOfProduction = new BigDecimal("9001.729");

        var incomePerYear = incomePerMonth.subtract(priceOfRent)
                .subtract(costOfProduction)
                .multiply(BigDecimal.valueOf(12))
                .setScale(2, RoundingMode.HALF_UP);

        String sign = "";

        if (incomePerYear.compareTo(BigDecimal.ZERO) > 0) {
            sign = "+";
        }

        System.out.printf("Прибыль за год: %s%f руб.", sign, incomePerYear);
    }
}