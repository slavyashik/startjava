import java.util.Random;

/**
 * Урок 1.
 */
public class RpsGameFormatting {
    /**
     * Игра Камень-Ножницы-Бумага.
     */
    public static void main(String[] args) throws InterruptedException {
        String rock = "✊";
        String scissors = "✌\uFE0F";
        String paper = "✋";
        Random random = new Random();
        int choiceNumber;

        // Ход первого игрока
        String firstPlayer = "HEL";
        choiceNumber = random.nextInt(1, 100);
        String firstPlayerSign = rock;

        if (choiceNumber > 66) {
            firstPlayerSign = paper;
        } else if (choiceNumber > 33) {
            firstPlayerSign = scissors;
        }

        System.out.println("Ход " + firstPlayer + ": ");

        for (int i = 0; i < 5; i++) {
            System.out.print(rock + "\r");
            Thread.sleep(100);
            System.out.print(scissors + "\r");
            Thread.sleep(100);
            System.out.print(paper + "\r");
            Thread.sleep(100);
        }

        System.out.println(firstPlayerSign);

        // Ход второго игрока
        String secondPlayer = "WALLE";
        choiceNumber = random.nextInt(1, 100);
        String secondPlayerSign = rock;

        if (choiceNumber > 66) {
            secondPlayerSign = paper;
        } else {
            if (choiceNumber > 33) {
                secondPlayerSign = scissors;
            }
        }

        System.out.println("Ход " + secondPlayer + ": ");

        for (int i = 0; i < 5; i++) {
            System.out.print(rock + "\r");
            Thread.sleep(100);
            System.out.print(scissors + "\r");
            Thread.sleep(100);
            System.out.print(paper + "\r");
            Thread.sleep(100);
        }

        System.out.println(secondPlayerSign);

        if (firstPlayerSign.equals(secondPlayerSign)) {
            System.out.println("Победила дружба!");
            return;
        }

        boolean hasFirstPlayerWon = firstPlayerSign.equals(rock) && 
                secondPlayerSign.equals(scissors) || firstPlayerSign.equals(scissors) && 
                secondPlayerSign.equals(paper) || firstPlayerSign.equals(paper) && 
                secondPlayerSign.equals(rock);

        if (hasFirstPlayerWon) {
            System.out.println("\nПобедил - " + firstPlayer);
        } else {
            System.out.println("\nПобедил - " + secondPlayer);
        }
    }
}