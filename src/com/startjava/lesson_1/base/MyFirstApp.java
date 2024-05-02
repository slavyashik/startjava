import java.util.Scanner;

/**
 * Урок 1.
 */
public class MyFirstApp {
    /**
     * Тренировочное приложение.
     **/
    public static void main(String[] args) {
        System.out.println("Написано однажды, работает везде");
        Scanner console = new Scanner(System.in);
        System.out.print("Введите свое имя: ");
        System.out.println(console.nextLine());
        System.out.println("Удачи");
    }

}