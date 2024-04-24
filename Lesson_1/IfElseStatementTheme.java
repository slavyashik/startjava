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
        int age = 32;
        double growth = 1.99;


        if (!maleGender) {
            System.out.println("Женщина");
        } else {
            System.out.println("Мужик");
        }

        if (age > 18) {
            System.out.println("Взрослый Мужик");
        } else {
            System.out.println("пока не мужик");
        }

        if (growth < 1.8) {
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

        int firstNumber = 123;
        int secondNumber = 321;

        if (firstNumber > secondNumber) {
            System.out.println("Число " + firstNumber + " больше " + secondNumber);
        } else if (firstNumber == secondNumber) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Число " + secondNumber + " больше " + firstNumber);
        }

        System.out.println("\n3. Проверка числа");
        int number = 113;
        boolean isPositiveNumber = false;
        boolean isEvenNumber = false;

        if (number == 0) {
            System.out.println("Число равно 0");
        } else {
            if (number % 2 == 0) {
                isEvenNumber = true;
            }

            if (number > 0) {
                isPositiveNumber = true;
            }

            System.out.println(number + " является " +
                    (isPositiveNumber ? "положительным" : "отрицательным") + " и " + 
                    (isEvenNumber ? "четным" : "нечетным"));
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");

        int numberOne = 123;
        int numberTwo = 224;

        int numberOneFirstDigit = numberOne / 100;
        int numberOneSecondDigit = numberOne % 100 / 10;
        int numberOneThirdDigit = numberOne % 100 % 10;
        int numberTwoFirstDigit = numberTwo / 100;
        int numberTwoSecondDigit = numberTwo % 100 / 10;
        int numberTwoThirdDigit = numberTwo % 100 % 10;

        if (numberOneFirstDigit != numberOneSecondDigit && 
                numberOneFirstDigit != numberOneThirdDigit &&
                numberTwoFirstDigit != numberTwoSecondDigit &&
                numberTwoFirstDigit != numberTwoThirdDigit) {
            System.out.println("Все цифры в разрядах двух чисел разные.");
        } else {
            boolean hasEqualDigit = false;
            System.out.println("Исходные числа: " + numberOne + " и " + numberTwo);

            if (numberOneThirdDigit == numberTwoThirdDigit) {
                System.out.println("Цифры " + numberOneThirdDigit + " и " + numberTwoThirdDigit + 
                        " первого разряда равны");
                hasEqualDigit = true;
            }

            if (numberOneSecondDigit == numberTwoSecondDigit) {
                System.out.println("Цифры " + numberOneSecondDigit + " и " + numberTwoSecondDigit + 
                        " второго разряда равны");
                hasEqualDigit = true;
            }

            if (numberOneFirstDigit == numberTwoFirstDigit) {
                System.out.println("Цифры " + numberOneFirstDigit + " и " + numberTwoFirstDigit + 
                        " третьего разряда равны");
                hasEqualDigit = true;
            }

            if (!hasEqualDigit) {
                System.out.println("Равных цифр нет.");
            }
        }

        System.out.println("\n5. Определение символа по его коду");

        char charCode = '\u0057';
        boolean isDigit = false;
        boolean isChar = false;
        boolean isBigChar = false;

        if (charCode >= 'A' && charCode <= 'Z') {
            isChar = true;
            isBigChar = true;
        } else if (charCode >= 'a' && charCode <= 'z') {
            isChar = true;
        } else if (charCode >= '0' && charCode <= '9') {
            isDigit = true;
        }

        if (!isChar && !isDigit) {
            System.out.println("Символ " + charCode + " не является ни буквой, ни цифрой.");
        } else if (isChar) {
            System.out.println("Символ " + charCode + " является " + 
                    (isBigChar ? "большой" : "маленькой") + " буквой");
        } else {
            System.out.println("Символ " + charCode + " является цифрой.");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");

        int amountDeposit = 301000;
        double annualIncome = 0.0;

        if (amountDeposit < 100000) {
            annualIncome = (double) amountDeposit * 0.05;
        } else if (annualIncome >= 100000 && annualIncome <= 300000) {
            annualIncome = (double) amountDeposit * 0.07;
        } else {
            annualIncome = (double) amountDeposit * 0.1;
        }

        System.out.println("Сумма вклада: " + amountDeposit);
        System.out.println("Сумма начисленных % за год: " + (int) annualIncome);
        System.out.println("Итоговая сумма с %: " + ((int) annualIncome + amountDeposit));

        System.out.println("\n7. Определение оценки по предметам");

        int percentHistory = 59;
        int percentProgramming = 92;
        int markHistory = 0;
        int markProgramming = 0;

        if (percentHistory <= 60) {
            markHistory = 2;
        } else if (percentHistory > 91) {
            markHistory = 5;
        } else if (percentHistory > 73) {
            markHistory = 4;
        } else {
            markHistory = 3;
        }

        if (percentProgramming <= 60) {
            markProgramming = 2;
        } else if (percentProgramming > 91) {
            markProgramming = 5;
        } else if (percentProgramming > 73) {
            markProgramming = 4;
        } else {
            markProgramming = 3;
        }

        int averageMarkScore = (markHistory + markProgramming) / 2;
        int averagePercentScore = (percentHistory + percentProgramming) / 2;

        System.out.println("Оценка по истории: " + markHistory);
        System.out.println("Оценка по программированию: " + markProgramming);
        System.out.println("Средний бал по предметам: " + averageMarkScore);
        System.out.println("Средний процент по предметам: " + averagePercentScore);

        System.out.println("\n8. Расчет годовой прибыли");

        int incomePerMonth = 13000;
        int priceOfRent = 5000;
        int costOfProduction = 9000;
        int incomePerYear = (incomePerMonth - priceOfRent - costOfProduction) * 12;

        System.out.println("Прибыль за год: " + (incomePerYear == 0 ? ""
                : (incomePerYear > 0 ? "+" : "")) + incomePerYear / 1000 + " 000" + " руб.");
    }
}