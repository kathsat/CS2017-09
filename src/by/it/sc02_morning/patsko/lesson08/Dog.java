package by.it.sc02_morning.patsko.lesson08;

public class Dog {
    private String name;
    private int age;
    private int weight; //вес собаки
    private double power; //сила укуса собаки


    public void setName(String name){this.name=name;}
    public void setAge(int age){this.age=age;}
    public void setWeight(int weight){this.weight=weight;}
    public void setPower(double power){this.power=power;}

    public String getName() {return name;}
    public int getAge() {return age;}
    public int getWeight() {return weight;}
    public double getPower() {return power;}


    public String toString() {
        return String.format("Кличка: %s. Возраст: %d", name, age);
    }
    public boolean win(Dog otherDog) {
        //Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.
        double chance_thisDog=0.2*this.age+0.3*this.weight+0.5*this.power;
        double chance_otherDog=0.2*otherDog.age+0.3*otherDog.weight+0.5*otherDog.power;
        return chance_thisDog>chance_otherDog;
    }
}
