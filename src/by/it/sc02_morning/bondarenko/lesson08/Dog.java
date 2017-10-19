package by.it.sc02_morning.bondarenko.lesson08;

public class Dog {

    private String name;
    private int age;
    private int weight;
    private double power;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    double getPower() {
        return power;
    }

    void setPower(double power) {
        this.power = power;
    }

    boolean win(Dog otherDog) {
        return (0.2 * this.getAge() + 0.3 * this.getWeight() + 0.5 * getPower()) >
                (0.2 * otherDog.getAge() + 0.3 * otherDog.getWeight() + 0.5 * otherDog.getPower());
    }

    @Override
    public String toString() {
        return String.format("Кличка: %s. Возраст: %d", name, age);
    }
}