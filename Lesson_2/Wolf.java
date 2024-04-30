/**
 * Урок 2.
 */
public class Wolf {
    private String gender;
    private String nickName;
    private String color;
    private double weight;
    private int age;

    void setGender(String gender) {
        this.gender = gender;
    }

    String getGender() {
        return gender;
    }

    void setNickName(String nickName) {
        this.nickName = nickName;
    }

    String getNickName() {
        return nickName;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    double getWeight() {
        return weight;
    }

    void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    int getAge() {
        return age;
    }

    public void walk() {
        System.out.println(nickName + " is walking");
    }

    public void sit() {
        System.out.println(nickName + " is sitting");
    }

    public void run() {
        System.out.println(nickName + " is running");
    }

    public void howl() {
        System.out.println(nickName + " is howling");
    }

    public void hunt() {
        System.out.println(nickName + " is hunting");
    }
}