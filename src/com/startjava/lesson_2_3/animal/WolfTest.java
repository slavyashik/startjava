package src.com.startjava.lesson_2_3.animal;

/**
 * Урок 2.
 */
public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setAge(10);
        wolf.setNickName("Wolfie");
        wolf.setGender("male");
        wolf.setWeight(22.2);
        wolf.setColor("black");

        System.out.println(wolf.getNickName() + " is a " + wolf.getGender() + 
                " and age is " + wolf.getAge() + ". His color is " + wolf.getColor() + 
                " and he weights " + wolf.getWeight() + " kgs");

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}