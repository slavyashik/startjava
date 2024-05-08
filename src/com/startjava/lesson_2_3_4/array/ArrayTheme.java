package src.com.startjava.lesson_2_3_4.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayTheme {
    public static void main(String[] args) {
        reverseArray();
        factorial();
        removeItems();
        printAlphabet();
        fillUniqueNumbers();
        startHangman();
    }

    static void reverseArray() {
        System.out.println("1. Реверс значений массива");

        int[] reverseNumbers = {7, 2, 6, 1, 5, 3, 4};
        System.out.print("До реверса: ");
        printArray(reverseNumbers);
        int len = reverseNumbers.length;

        for (int i = 0; i <= len / 2; i++) {
            int temp = reverseNumbers[--len];
            reverseNumbers[len] = reverseNumbers[i];
            reverseNumbers[i] = temp;
        }

        System.out.print("После реверса: ");
        printArray(reverseNumbers);
    }

    static void factorial() {
        System.out.println("\n2. Вычисление факториала");

        int[] multipliers = new int[10];
        int len = multipliers.length;
        for (int i = 0; i < len; i++) {
            multipliers[i] = i;
        }

        int factorial = 1;
        for (int i = 1; i < len - 1; i++) {
            System.out.print(multipliers[i] + (i < 8 ? " * " : " = "));
            factorial *= multipliers[i];
        }

        System.out.print(factorial);
    }

    static void removeItems() {
        System.out.println("\n\n3. Удаление элементов массива");

        Random random = new Random();
        double[] randomItems = new double[15];
        int len = randomItems.length;

        for (int i = 0; i < len; i++) {
            randomItems[i] = random.nextDouble();
        }

        System.out.println("Исходный массив: ");
        printItems(randomItems);

        double middleItem = randomItems[len / 2];
        System.out.printf("\nЧисло в средней ячейке: %.3f\n", middleItem);

        int deletedItemsCount = 0;
        for (int i = 0; i < len; i++) {
            if (randomItems[i] > middleItem) {
                randomItems[i] = 0;
                deletedItemsCount++;
            }
        }

        System.out.println("\nИзмененный массив: ");
        printItems(randomItems);
        System.out.println("Количество обнуленных ячеек: " + deletedItemsCount);
    }

    static void printAlphabet() {
        System.out.println("\n4. Вывод алфавита лесенкой");

        char[] alphabet = new char[26];
        int len = alphabet.length;

        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j >= len - i - 1; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }

    static void fillUniqueNumbers() {
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

    static void startHangman() {
        System.out.println("\n6. \"Игра Виселица\"");

        int tries = 0;
        int mistakes = 0;
        Scanner scanner = new Scanner(System.in);
        String secretWord = receiveSecretWord();
        StringBuilder maskedWord = new StringBuilder("*".repeat(secretWord.length()));
        StringBuilder wrongChars = new StringBuilder();
        StringBuilder guessedChars = new StringBuilder();

        do {
            System.out.println("Загаданное слово: " + maskedWord);
            System.out.print("Введите букву: ");
            String guess = scanner.next();
            System.out.println();

            if (wrongChars.indexOf(guess) >= 0 || guessedChars.indexOf(guess) >= 0) {
                System.out.println("Буква уже была");
                continue;
            }

            if (secretWord.contains(guess)) {
                tries++;
                StringBuilder temp = new StringBuilder(secretWord);

                while (temp.indexOf(guess) >= 0) {
                    int index = temp.indexOf(guess);
                    maskedWord.setCharAt(index, guess.charAt(0));
                    temp.setCharAt(index, ' ');
                    System.out.println(maskedWord);
                }

                if (mistakes > 0) {
                    mistakes--;
                }

                guessedChars.append(guess);
            } else {
                mistakes++;
                tries++;
                wrongChars.append(guess);
                System.out.println("Ошибочные буквы: " + wrongChars);

                if (mistakes == 6) {
                    System.out.println("Вы проиграли.");
                    System.out.println("Загаданное слово: " + secretWord);
                }
            }

            if (secretWord.contentEquals(maskedWord)) {
                System.out.println("Поздравляем, вы выиграли!");
                System.out.println("Итоговое количество попыток: " + tries);
                System.out.println("Загаданное слово: " + secretWord);
                break;
            }

            drawHangman(mistakes);
            System.out.println("Количество попыток: " + tries);
        } while (mistakes < 6);
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static void printItems(double[] uniqueNumbers) {
        for (int i = 0; i < uniqueNumbers.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%.3f ", uniqueNumbers[i]);
        }
        System.out.println();
    }

    private static String receiveSecretWord() {
        String[] words = {"аппарат", "завтрак", "коробочка", "отражение", "респектор",
                "продукция", "маневр", "устройство", "формулировка", "театраль"};
        int index = (int) (Math.random() * words.length);
        return words[index];
    }

    private static void drawHangman(int mistakes) {
        String[] hangmanMessages = {
                """
        ___________               
        |   \\    |
        |  
        |  
        |  
        |
        ~~~~~~~~~~~
        """,
                """
        ___________               
        |   \\    |
        |   ()
        |  
        |  
        |
        ~~~~~~~~~~~
        """,
                """
        ___________                
        |   \\    |
        |   ()
        |   []
        |  
        |
        ~~~~~~~~~~~
        """,
                """
        ___________                
        |   \\    |
        |   ()
        |  /[]
        |  
        |
        ~~~~~~~~~~~
        """,
                """
        ___________                
        |   \\    |
        |   ()
        |  /[]\\
        |  
        |
        ~~~~~~~~~~~
        """,
                """
        ___________                
        |   \\    |
        |   ()
        |  /[]\\
        |  /   
        |
        ~~~~~~~~~~~
        """,
                """
        ___________                
        |   \\    |
        |   ()
        |  /[]\\
        |  /  \\
        |
        ~~~~~~~~~~~
        """};

        System.out.println(hangmanMessages[mistakes]);
    }
}