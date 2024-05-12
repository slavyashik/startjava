package src.com.startjava.lesson_2_3_4.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayTheme {
    public static void main(String[] args) throws InterruptedException {
        reverseArray();
        factorial();
        removeItems();
        printAlphabet();
        fillUniqueNumbers();
        startHangman();
        printLikeMachine();
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

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int inputNumber = scanner.nextInt();
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (multipliers[i] == inputNumber) {
                index = i;
            }
        }

        System.out.printf("Результат вычисления %d!:\n", inputNumber);

        int factorial = 1;
        for (int i = 1; i <= multipliers[index]; i++) {
            System.out.print(multipliers[i] + (i < multipliers[index] ? " * " : " = "));
            factorial *= multipliers[i];
        }

        System.out.println(factorial);
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

        int removedItemsCount = 0;
        for (int i = 0; i < len; i++) {
            if (randomItems[i] > middleItem) {
                randomItems[i] = 0;
                removedItemsCount++;
            }
        }

        System.out.println("\nИзмененный массив: ");
        printItems(randomItems);
        System.out.println("Количество обнуленных ячеек: " + removedItemsCount);
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

        int mistakes = 0;
        Scanner scanner = new Scanner(System.in);
        String secretWord = receiveSecretWord();
        StringBuilder maskedWord = new StringBuilder("*".repeat(secretWord.length()));
        StringBuilder wrongChars = new StringBuilder();
        String[] hangmanParts = {"___\n|  \\\n", "|  ()\n", "| /", "[]", "\\\n", "| /", "  \\\n|"};
        int maxMistakes = hangmanParts.length - 1;

        do {
            System.out.println("Загаданное слово: " + maskedWord);
            System.out.print("Введите букву: ");
            String guess = scanner.next();
            System.out.println();

            if(!guess.matches("[а-яА-Я]")) {
                System.out.println("Нужно ввести русско-язычную букву.");
                continue;
            }

            if (guess.length() > 1) {
                System.out.println("Нельзя вводить больше одной буквы за раз.");
                continue;
            }

            if (wrongChars.indexOf(guess) >= 0 || maskedWord.indexOf(guess) >= 0) {
                System.out.println("Буква уже была.");
                continue;
            }

            if (secretWord.contains(guess)) {
                int index = 0;

                do {
                    index = secretWord.indexOf(guess.charAt(0), index);
                    if (index < 0) {
                        break;
                    }
                    maskedWord.setCharAt(index++, guess.charAt(0));
                    System.out.println(maskedWord);
                } while (true);

                if (mistakes > 0) {
                    mistakes--;
                }
            } else {
                mistakes++;
                wrongChars.append(guess);
                System.out.println("Ошибочные буквы: " + wrongChars);

                if (mistakes == maxMistakes) {
                    System.out.println("Вы проиграли.");
                    System.out.println("Загаданное слово: " + secretWord);
                }

            }

            if (secretWord.contentEquals(maskedWord)) {
                System.out.println("Поздравляем, вы выиграли!");
                break;
            }

            for (int i = 0; i <= mistakes; i++) {
                System.out.print(hangmanParts[i]);
            }
            System.out.println();
        } while (mistakes < maxMistakes);
        System.out.println("Количество оставшихся попыток: " + (maxMistakes - mistakes));
        System.out.println();
    }

    static void printLikeMachine() throws InterruptedException {
        System.out.println("\n7. Вывод текста с эффектом пишущей машинки");

        String quote1 = ("Java - это C++, из которого убрали все пистолеты, ножи и дубинки. \n- James Gosling");
        String quote2 = ("Чтобы написать чистый код, мы сначала пишем " +
                "грязный код, затем рефакторим его. \n- Robert Martin");

        printText(quote1);
        printText(quote2);
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

    private static void printText(String quote) throws InterruptedException {
        String[] words = quote.split("[^a-zA-Zа-яА-Я]+");
        String longestWord = words[0];
        String shortestWord = words[0];

        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }

            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        int shortestWordIndex = quote.indexOf(shortestWord);
        int longestWordEndIndex = quote.indexOf(longestWord) + longestWord.length();
        int indexCounter = 0;

        for (char c : quote.toCharArray()) {
            if (indexCounter >= shortestWordIndex && indexCounter <= longestWordEndIndex) {
                System.out.print(String.valueOf(c).toUpperCase());
            } else {
                System.out.print(c);
            }

            Thread.sleep(50);
            indexCounter++;
        }

        System.out.println();
    }
}