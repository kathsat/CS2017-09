package by.it.sc04_evening_tue_thu.krasikova.lesson08;

public class Dog {
    private String name;
    private int age;
    private int weight;
    private double power;

    String getName() {
        return name;
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

    public String toString(){
        return ("Кличка: "+name+". Возраст: "+age);
    }

    int getWeight() {return weight;}

    void setWeight (int weight) {
        this.weight=weight;
    }

    double getPower() {return power;}

    void setPower (double power) {
        this.power = power;
    }

    boolean win(Dog otherDog) {
        { boolean result = (0.2 * this.age + 0.3 * this.weight + 0.5 * this.power)>(0.2 * otherDog.getAge() + 0.3 * otherDog.getWeight() + 0.5 * otherDog.getPower());
        return result; }


    }
}
