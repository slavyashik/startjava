/**
 * Урок 2.
 */
public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.age = 10;
        wolf.alias = "Wolfie";
        wolf.gender = "male";
        wolf.weight = 22.2;
        wolf.color = "black";

        System.out.println(wolf.alias + " is a " + wolf.gender + " and age is " + wolf.age +
                ". His color is " + wolf.color + " and he weights " + wolf.weight + " kgs");

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}