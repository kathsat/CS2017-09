package by.it.sc02_morning.liplianina.lesson08;

public class Dog {

    private String name;
    private int age;
    private int weight;
    private double power;

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Кличка: %s. Возраст: %d", name, age);
    }

    boolean win(Dog otherDog) {
        double res1 = 0.2 * (double) this.age + 0.3 * (double) this.weight + 0.5 * this.power;
        double res2 = 0.2 * (double) otherDog.age + 0.3 * (double) otherDog.weight + 0.5 * otherDog.power;
        return (res1 > res2);
    }
}

