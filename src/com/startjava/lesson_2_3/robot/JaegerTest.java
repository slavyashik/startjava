package src.com.startjava.lesson_2_3.robot;

/**
 * Урок 2.
 */
public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger();
        gipsyDanger.setModelName("Gipsy Danger");
        gipsyDanger.setMark("Mark-3");
        gipsyDanger.setOrigin("United States of America");
        gipsyDanger.setHeight(79.25f);
        gipsyDanger.setWeight(44.728f);
        gipsyDanger.setStrength(8);
        gipsyDanger.setArmor(6);
        gipsyDanger.setSpeed(7);

        System.out.println(gipsyDanger);

        Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia",
                76.2f, 41.792f, 10, 9, 10);

        System.out.println(strikerEureka);

        strikerEureka.setArmor(10);
        System.out.printf("%s armor class changed to %d\n\n", 
                strikerEureka.getModelName(), strikerEureka.getArmor());

        gipsyDanger.move();
        strikerEureka.move();
        gipsyDanger.useVortexCannon();
        strikerEureka.useVortexCannon();
    }
}