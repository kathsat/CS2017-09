package by.it.sc02_morning.sinitsyna.lesson08;

public class Dog {
    private String name;
    private int age;
    private int weight;
    private double power;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() { return weight; }

    public void setWeight(int weight) { this.weight = weight; }

    public double getPower() { return power; }

    public void setPower(double power) { this.power = power; }

    @Override
    public String toString() {
        return String.format("Кличка: %s. Возраст: %d", name, age);

    }

}

