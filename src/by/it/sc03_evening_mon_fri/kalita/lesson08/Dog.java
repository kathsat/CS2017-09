package by.it.sc03_evening_mon_fri.kalita.lesson08;

import java.util.Scanner;

/**
 * Created by Denis on 20.10.2017.
 */
 class Dog {
    private int age;
    private String name;
    private int weight;
    private double power;
    public Dog() {
        age = 0;
        name = null;
    }
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    public double getPower() {
        return power;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPower(double power) {
        this.power = power;
    }
    public boolean win(Dog otherDog) {
        return this.chance() > otherDog.chance();

    }
    private double chance() {
        return 0.2 * age + 0.3 * weight + 0.5 * power;
    }
    @Override
    public String toString() {
        return "Кличка: " + name + ". Возраст: " + age;
    }
}