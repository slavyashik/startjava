package src.com.startjava.lesson_2_3.robot;

/**
 * Урок 2.
 */
public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int strength;
    private int armor;
    private int speed;

    public Jaeger() {}

    public Jaeger(String modelName, String mark, String origin, float height, 
            float weight, int strength, int armor, int speed) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
        this.speed = speed;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getModelName() {
        return modelName;
    }

    void setMark(String mark) {
        this.mark = mark;
    }

    String getMark() {
        return mark;
    }

    void setOrigin(String origin) {
        this.origin = origin;
    }

    String getOrigin() {
        return origin;
    }

    void setHeight(float height) {
        this.height = height;
    }

    float getHeight() {
        return height;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }

    float getWeight() {
        return weight;
    }

    void setStrength(int strength) {
        this.strength = strength;
    }

    int getStrength() {
        return strength;
    }

    void setArmor(int armor) {
        this.armor = armor;
    }

    int getArmor() {
        return armor;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    int getSpeed() {
        return speed;
    }

    boolean drift() {
        return true;
    }

    void move() {
        System.out.println(modelName + " is moving");
    }

    void useVortexCannon() {
        System.out.println("activated");
    }

    String scanKaiju() {
        return "scanning";
    }

    public String toString() {
        return String.format("Jaeger \"%s\" parameters are:\nMark: %s\nOrigin: %s\n" +
                "Height: %.2f m.\nWeight: %.3f tons\nStrength: %d\nArmor: %d\nSpeed: %d\n",
                modelName, mark, origin, height, weight, strength, armor, speed);
    }
}