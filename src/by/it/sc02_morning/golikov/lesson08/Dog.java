package by.it.sc02_morning.golikov.lesson08;

public class Dog {

    private String name;
    private int age;
    private int weight;
    private double power;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        String result = String.format("Кличка: %s. Возраст: %d", name, age);
        return result;
    }

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

    boolean win(Dog otherDog) {
        return 0.2 * this.getAge() + 0.3 * this.getWeight() + 0.5 * this.getPower() > 0.2 * otherDog.getAge() + 0.3 * otherDog.getWeight() + 0.5 * otherDog.getPower();
    }

}
