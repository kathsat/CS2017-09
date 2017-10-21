package by.it.sc04_evening_tue_thu.runec.lesson08;

public class Dog {
    private String name;// кличка собаки
    private int age;//возраст собаки


    String getName(){
        return this.name;
    }
    void setName(String name){
        this.name=name;
    }

    int getAge(){
        return age;
    }
    void setAge(int age){
        this.age=age;
    }

    public String toString(){
        return "Кличка: "+name+". Возраст: "+age;

    }

    private int weight; //вес собаки
    private double power; //сила укуса собаки

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

    public boolean win(Dog otherDog)
    {if ((0.2*this.age+0.3*this.weight+0.5*this.power)>(0.2*otherDog.age+0.3*otherDog.weight+0.5*otherDog.power)) return true;
        return false;
    }
}
