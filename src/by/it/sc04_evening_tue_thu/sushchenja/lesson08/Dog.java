package by.it.sc04_evening_tue_thu.sushchenja.lesson08;

public class Dog {

    private String name;
    private int age;
    private int weight;
    private double power;



    String getName(){
        return this.name;
    }

    void setName (String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge (int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public double getPower() {
        return power;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public  String toString () {
        return "Кличка: "+name+". Возраст: "+age;
    }

    boolean win (Dog dog) {
        if ((0.2 * this.age) + (0.3 * this.weight) + (0.5 * this.power)>(0.2 * dog.age) + (0.3 * dog.weight) + (0.5 * dog.power))
            return true;
        return false;
    }
}
