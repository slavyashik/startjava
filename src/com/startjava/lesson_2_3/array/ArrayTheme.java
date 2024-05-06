package src.com.startjava.lesson_2_3.array;

import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
        reverseArray();
        doFactorial();
        removeItem();
        printAlphabet();
        pushUniqueNumbers();
    }

    static void reverseArray() {
        System.out.println("1. Реверс значений массива");

        int[] inputArray = {7, 2, 6, 1, 5, 3, 4};

        System.out.print("До реверса: ");
        printArray(inputArray);

        for (int i = 0; i < inputArray.length / 2; i++) {
            int temp = inputArray[inputArray.length - i - 1];
            inputArray[inputArray.length - i - 1] = inputArray[i];
            inputArray[i] = temp;
        }

        System.out.print("После реверса: ");
        printArray(inputArray);
    }

    static void doFactorial() {
        System.out.println("\n2. Вычисление факториала");

        var arrayDigits = new int[10];

        for (int i = 0; i < arrayDigits.length; i++) {
            arrayDigits[i] = i;
        }

        int result = arrayDigits[1];
        int factorialNumber = 8;
        for (int i = 1; i <= factorialNumber; i++) {
            System.out.print("" + arrayDigits[i] + (i < factorialNumber ? " * " : ""));
            result *= arrayDigits[i];
        }

        System.out.print(" = " + result);
    }

    static void removeItem() {
        System.out.println("\n\n3. Удаление элементов массива");

        Random random = new Random();
        var arrayDoubles = new Double[15];

        System.out.println("Исходный массив: ");
        for (int i = 0; i < arrayDoubles.length; i++) {
            if (i == 8) {
                System.out.println();
            }

            arrayDoubles[i] = random.nextDouble();
            System.out.printf("%.3f ", arrayDoubles[i]);
        }
        System.out.println();

        int middleIndex = arrayDoubles.length / 2 + arrayDoubles.length % 2;
        System.out.printf("\nЧисло в средней ячейке: %.3f\n", arrayDoubles[middleIndex]);

        int removeCount = 0;
        for (int i = 0; i < arrayDoubles.length; i++) {
            if (i == middleIndex) {
                continue;
            }
            if (arrayDoubles[i] > arrayDoubles[middleIndex]) {
                arrayDoubles[i] = 0.000;
                removeCount++;
            }
        }

        System.out.println("\nИзмененный массив: ");
        for (int i = 0; i < arrayDoubles.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%.3f ", arrayDoubles[i]);
        }
        System.out.println("\n\nКоличество обнуленных ячеек: " + removeCount);
    }

    static void printAlphabet() {
        System.out.println("\n4. Вывод алфавита лесенкой");

        var alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = alphabet.length - 1; j >= alphabet.length - i - 1; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }

    static void pushUniqueNumbers() {
        System.out.println("\n5. Заполнение массива уникальными числами");

        var uniqueNumbers = new int[30];

        for (int i = 0; i < uniqueNumbers.length; i++) {
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

        for (int i = uniqueNumbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (uniqueNumbers[j] > uniqueNumbers[j + 1]) {
                    int temp = uniqueNumbers[j + 1];
                    uniqueNumbers[j + 1] = uniqueNumbers[j];
                    uniqueNumbers[j] = temp;
                }
            }
        }

        for (int i = 0; i < uniqueNumbers.length; i++) {
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
}