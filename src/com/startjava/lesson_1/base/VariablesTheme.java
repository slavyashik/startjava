import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Урок 1.
 */
public class VariablesTheme {
    /**
     * Задание на тему "Переменные: примитивные типы данных".
     */
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");

        byte amountCpuCores = 4;
        System.out.println("Количество процессорных ядер = " + amountCpuCores);

        short cpuFrequency = 2200;
        System.out.println("Частота процессора = " + cpuFrequency + " МГц");

        int amountRamModules = 8;
        System.out.println("количество модулей оперативной памяти = " + amountRamModules + " шт.");

        long amountRamTotal = 32768;
        System.out.println("объём оперативной памяти общий = " + amountRamTotal + " МБ");

        float ramFrequency = 5000f;
        System.out.println("частота оперативной памяти = " + ramFrequency + " МГц");

        double hddCapacity = 1024;
        System.out.println("емкость жесткого диска = " + hddCapacity + " Гб");

        char motherboardIndex = 'A';
        System.out.println("индекс материнской платы = " + motherboardIndex);

        boolean isMotherboardTypeServer = false;
        System.out.println("материнская плата серверного типа? = " + isMotherboardTypeServer);

        System.out.println("\n2. Расчет стоимости товара со скидкой");

        var penPrice = new BigDecimal("105.5");
        var bookPrice = new BigDecimal("235.83");
        var discount = new BigDecimal("0.11");

        var totalPriceWithoutDiscount = penPrice.add(bookPrice);
        var sumDiscount = totalPriceWithoutDiscount.multiply(discount)
                .setScale(2, RoundingMode.HALF_UP);
        var totalPrice = totalPriceWithoutDiscount.subtract(sumDiscount);

        System.out.printf("общая стоимость товаров без скидки = %.2f%n", totalPriceWithoutDiscount);
        System.out.printf("сумма скидки = %.2f%n", sumDiscount);
        System.out.printf("общая стоимость товаров со скидкой = %.2f%n", totalPrice);

        System.out.println("\n3. Вывод слова JAVA");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");

        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;

        System.out.println(maxByte);
        System.out.println(++maxByte);
        System.out.println(--maxByte + "\n");

        System.out.println(maxShort);
        System.out.println(++maxShort);
        System.out.println(--maxShort + "\n");

        System.out.println(maxInt);
        System.out.println(++maxInt);
        System.out.println(--maxInt + "\n");

        System.out.println(maxLong);
        System.out.println(++maxLong);
        System.out.println(--maxLong);

        System.out.println("\n5. Перестановка значений переменных");

        int a = 2;
        int b = 5;

        System.out.println("Исходные значения: " + a + " и " + b);

        int swap = a;
        a = b;
        b = swap;

        System.out.println("\nПерестановка с помощью третьей переменной.");
        System.out.println("Результат: " + a + " и " + b);

        a += b;
        b = a - b;
        a -= b;

        System.out.println("\nПерестановка с помощью арифметической операции.");
        System.out.println("Результат: " + a + " и " + b);

        a ^= b;
        b ^= a;
        a ^= b;

        System.out.println("\nПерестановка с помощью побитовой операции.");
        System.out.println("Результат: " + a + " и " + b);

        System.out.println("\n6. Вывод символов и их кодов");

        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';

        System.out.println((int) dollar + " " + dollar);
        System.out.println((int) asterisk + " " + asterisk);
        System.out.println((int) atSign + " " + atSign);
        System.out.println((int) verticalBar + " " + verticalBar);
        System.out.println((int) tilde + " " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");

        char slash = '/';
        char backSlash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';

        System.out.println("    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + underscore + leftParenthesis +
                " " + rightParenthesis + backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore +
                slash + backSlash + underscore + underscore + backSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");

        int number = 123;
        int amountHundreds = number / 100;
        int amountTens = number / 10 % 10;
        int amountOnes = number % 10;
        int sumOfDigits = amountHundreds + amountTens + amountOnes;
        int productOfDigits = amountHundreds * amountTens * amountOnes;

        System.out.println("Число " + number + " содержит:");
        System.out.println("  сотен - " + amountHundreds);
        System.out.println("  десятков - " + amountTens);
        System.out.println("  единиц - " + amountOnes);
        System.out.println("Сумма его цифр = " + sumOfDigits);
        System.out.println("Произведение = " + productOfDigits);

        System.out.println("\n9. Вывод времени");

        int amountSeconds = 86399;
        int hh = amountSeconds / 3600;
        int mm = amountSeconds % 3600 / 60;
        int ss = amountSeconds % 60;

        System.out.println(hh + ":" + mm + ":" + ss);
    }
}