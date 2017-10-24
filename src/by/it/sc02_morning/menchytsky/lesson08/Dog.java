package by.it.sc02_morning.menchytsky.lesson08;

public class Dog {
    String name;
    int age;
    private int weight; //вес собаки
    private double power; //сила укуса собаки

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public Integer getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

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

    public String toString(){
        return "Кличка: "+getName()+". Возраст: "+getAge();
        //метод должен вернуть строку экземляра класса в виде форматированной строки
        //Пример:
       // Кличка: Шарик. Возраст: 5
    }

    boolean win(Dog otherDog){

        return 0.2*this.getAge()+0.3*this.getWeight()+0.5*this.getPower() > 0.2*otherDog.getAge()+0.3*otherDog.getWeight()+0.5*otherDog.getPower();
    }
}
