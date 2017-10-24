package by.it.sc04_evening_tue_thu.migdasyova.lesson08;

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

    public String toString() {
        return "Кличка: " + name + ". Возраст: " + age;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    int getWeight() {
        return weight;
    }

    void setPower(double power) {
        this.power = power;
    }

    double getPower() {
        return power;
    }

    boolean win(Dog otherDog) {
        return 0.2 * this.age + 0.3 * this.weight + 0.5 * this.power >
                0.2 * otherDog.getAge() + 0.3 * otherDog.getWeight() + 0.5 * otherDog.getPower();
    }
}
