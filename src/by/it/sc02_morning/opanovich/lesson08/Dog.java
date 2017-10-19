package by.it.sc02_morning.opanovich.lesson08;

public class Dog {
    private String name;
    private int age;
    private int weight;
    private double power;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    void setPower(double power) {
        this.power = power;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    int getWeight() {
        return weight;
    }

    double getPower() {
        return power;
    }

    boolean win(Dog otherDog) {
        return 0.2 * this.getAge() + 0.3 * this.getWeight() + 0.5 * this.getPower() >
                0.2 * otherDog.getAge() + 0.3 * otherDog.getWeight() + 0.5 * otherDog.getPower();
    }

    @Override
    public String toString() {
        return "Кличка: " + name + ". Возраст: " + age;
    }
}
