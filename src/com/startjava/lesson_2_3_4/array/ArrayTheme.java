package src.com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
        reverseArray();
        factorial();
        removeItem();
        printAlphabet();
        pushUniqueNumbers();
    }

    static void reverseArray() {
        System.out.println("1. Реверс значений массива");

        int[] reverseNumbers = {7, 2, 6, 1, 5, 3, 4};
        System.out.print("До реверса: ");
        printArray(reverseNumbers);
        int len = reverseNumbers.length;

        for (int i = 0; i < len / 2; i++) {
            int temp = reverseNumbers[len - i - 1];
            reverseNumbers[len - i - 1] = reverseNumbers[i];
            reverseNumbers[i] = temp;
        }

        System.out.print("После реверса: ");
        printArray(reverseNumbers);
    }

    static void factorial() {
        System.out.println("\n2. Вычисление факториала");

        int[] inputDigits = new int[10];
        int len = inputDigits.length;
        for (int i = 0; i < len; i++) {
            inputDigits[i] = i;
        }

        int result = inputDigits[1];
        int factorialNumber = 8;
        for (int i = 1; i <= factorialNumber; i++) {
            System.out.print("" + inputDigits[i] + (i < factorialNumber ? " * " : ""));
            result *= inputDigits[i];
        }

        System.out.print(" = " + result);
    }

    static void removeItem() {
        System.out.println("\n\n3. Удаление элементов массива");

        Random random = new Random();
        double[] inputItems = new double[15];
        int len = inputItems.length;

        for (int i = 0; i < len; i++) {
            inputItems[i] = random.nextDouble();
        }

        System.out.println("Исходный массив: ");
        printItems(inputItems);

        int middleIndex = len / 2 + len % 2;
        System.out.printf("\nЧисло в средней ячейке: %.3f\n", inputItems[middleIndex]);

        int removeCount = 0;
        for (int i = 0; i < len; i++) {
            if (i == middleIndex) {
                continue;
            }

            if (inputItems[i] > inputItems[middleIndex]) {
                inputItems[i] = 0.000;
                removeCount++;
            }
        }

        System.out.println("\nИзмененный массив: ");
        printItems(inputItems);
        System.out.println("\n\nКоличество обнуленных ячеек: " + removeCount);
    }

    static void printAlphabet() {
        System.out.println("\n4. Вывод алфавита лесенкой");

        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        for (int i = 0; i < alphabet.length; i++) {
            for (int j = alphabet.length - 1; j >= alphabet.length - i - 1; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }

    static void pushUniqueNumbers() {
        System.out.println("\n5. Заполнение массива уникальными числами");

        int[] uniqueNumbers = new int[30];
        int len = uniqueNumbers.length;

        for (int i = 0; i < len; i++) {
            int randomNumber;
            boolean isUnique;

            do {
                isUnique = true;
                randomNumber = (int) (Math.random() * 40) + 60;

                for (int j = 0; j < i; j++) {
                    if (uniqueNumbers[j] == randomNumber) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);

            uniqueNumbers[i] = randomNumber;
        }

        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (uniqueNumbers[j] > uniqueNumbers[j + 1]) {
                    int temp = uniqueNumbers[j + 1];
                    uniqueNumbers[j + 1] = uniqueNumbers[j];
                    uniqueNumbers[j] = temp;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.print(uniqueNumbers[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    private static void printItems(double[] itemsCheck) {
        for (int i = 0; i < itemsCheck.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%.3f ", itemsCheck[i]);
        }
        System.out.println();
    }
}