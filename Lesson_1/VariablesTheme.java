/**
 * Урок 1.
 */
public class VariablesTheme {
  /**
  * Задание на тему "Переменные: примитивные типы данных".
  */
  public static void main(String[] args) {
    System.out.println("1. Вывод характеристик компьютера");

    //Количество процессорных ядер
    byte amountOfCpuCores = 4;
    System.out.println("Количество процессорных ядер = " + amountOfCpuCores);

    //Частота процессора
    short freqOfCpu = 2200;
    System.out.println("Частота процессора = " + freqOfCpu + " МГц");

    //количество модулей оперативной памяти
    int amountOfRamModules = 8;
    System.out.println("количество модулей оперативной памяти = " + amountOfRamModules + " шт.");

    //объём оперативной памяти общий
    long amountOfRamTotal = 32768;
    System.out.println("объём оперативной памяти общий = " + amountOfRamTotal + " МБ");

    //частота оперативной памяти
    float freqOfRam = 5000f;
    System.out.println("частота оперативной памяти = " + freqOfRam + " МГц");

    //емкость жесткого диска
    double capacityOfHdd = 1024;
    System.out.println("емкость жесткого диска = " + capacityOfHdd + " Гб");

    //индекс материнской платы
    char indexOfMotherboard = 'A';
    System.out.println("индекс материнской платы = " + indexOfMotherboard);

    //материнская плата серверного типа?
    boolean isMotherboardServerType = false;
    System.out.println("материнская плата серверного типа? = " + isMotherboardServerType);

    System.out.println("\n2. Расчет стоимости товара со скидкой");

    int priceOfPen = 100;
    int priceOfBook = 200;
    double discount = 0.11;

    int totalPriceWithoutDiscount = priceOfBook + priceOfPen;
    double sumOfDiscount = (double) totalPriceWithoutDiscount * discount;
    double totalPriceWithDiscount = totalPriceWithoutDiscount - sumOfDiscount;

    System.out.println("общая стоимость товаров без скидки = " + totalPriceWithoutDiscount);
    System.out.println("сумма скидки = " + sumOfDiscount);
    System.out.println("общая стоимость товаров со скидкой = " + totalPriceWithDiscount);

    System.out.println("\n3. Вывод слова JAVA");

    System.out.println("   J    a  v     v  a");
    System.out.println("   J   a a  v   v  a a");
    System.out.println("J  J  aaaaa  V V  aaaaa");
    System.out.println(" JJ  a     a  V  a     a");

    System.out.println("\n4. Вывод min и max значений целых числовых типов");

    byte firstNumber = 127;
    short secondNumber = 32767;
    int thirdNumber = 2147483647;
    long fourthNumber = 9223372036854775807L;

    System.out.println(firstNumber);
    System.out.println(++firstNumber);
    System.out.println(--firstNumber + "\n");

    System.out.println(secondNumber);
    System.out.println(++secondNumber);
    System.out.println(--secondNumber + "\n");

    System.out.println(thirdNumber);
    System.out.println(++thirdNumber);
    System.out.println(--thirdNumber + "\n");

    System.out.println(fourthNumber);
    System.out.println(++fourthNumber);
    System.out.println(--fourthNumber);

    System.out.println("\n5. Перестановка значений переменных");

    int firstDigit = 2;
    int secondDigit = 5;

    System.out.println("Исходные значения: " + firstDigit + " и " + secondDigit);

    //с помощью третьей переменной
    int temp = firstDigit;
    firstDigit = secondDigit;
    secondDigit = temp;

    System.out.println("\nПерестановка с помощью третьей переменной.");
    System.out.println("Результат: " + firstDigit + " и " + secondDigit);

    //с помощью арифметической операции
    firstDigit = firstDigit + secondDigit;
    secondDigit = firstDigit - secondDigit;
    firstDigit = firstDigit - secondDigit;

    System.out.println("\nПерестановка с помощью арифметической операции.");
    System.out.println("Результат: " + firstDigit + " и " + secondDigit);

    //с помощью побитовой операции
    firstDigit = firstDigit ^ secondDigit;
    secondDigit = secondDigit ^ firstDigit;
    firstDigit = firstDigit ^ secondDigit;

    System.out.println("\nПерестановка с помощью побитовой операции.");
    System.out.println("Результат: " + firstDigit + " и " + secondDigit);

    System.out.println("\n6. Вывод символов и их кодов");

    char charOne = '$';
    char charTwo = '*';
    char charThree = '@';
    char charFour = '|';
    char charFive = '~';

    System.out.println((int) charOne + " " + charOne);
    System.out.println((int) charTwo + " " + charTwo);
    System.out.println((int) charThree + " " + charThree);
    System.out.println((int) charFour + " " + charFour);
    System.out.println((int) charFive + " " + charFive);

    System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");

    char slash = '/';
    char backSlash = '\\';
    char underscore = '_';
    char leftParenthesis = '(';
    char rightParenthesis = ')';

    System.out.println("    " + slash + backSlash);
    System.out.println("   " + slash + "  " + backSlash);
    System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis 
        + backSlash);
    System.out.println(" " + slash + "      " + backSlash);
    System.out.println(slash + "" + underscore + "" + underscore + "" + underscore + "" 
        + underscore + "" + slash + "" + backSlash + "" + underscore + "" + underscore + "" 
        + backSlash);

    System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");

    int number = 123;

    //количество сотен
    int amountOfHundreds = number / 100;

    //количество десятков
    int amountOfTens = number % 100 / 10;

    //количество единиц
    int amountOfOnes = number % 100 % 10;

    //сумма цифр числа
    int sumOfDigits = amountOfHundreds + amountOfTens + amountOfOnes;

    //произведение чисел
    int productOfDigits = amountOfHundreds * amountOfTens * amountOfOnes;

    System.out.println("Число " + number + " содержит:");
    System.out.println("  сотен - " + amountOfHundreds);
    System.out.println("  десятков - " + amountOfTens);
    System.out.println("  сотен - " + amountOfOnes);
    System.out.println("Сумма его цифр = " + sumOfDigits);
    System.out.println("Произведение = " + productOfDigits);

    System.out.println("\n9. Вывод времени");

    int amountOfSeconds = 86399;

    //количество часов
    int hours = amountOfSeconds / 3600;

    //количество минут
    int minutes = amountOfSeconds % 3600 / 60;

    //количество секунд
    int seconds = amountOfSeconds % 60;

    System.out.println(hours + ":" + minutes + ":" + seconds);
  }
}