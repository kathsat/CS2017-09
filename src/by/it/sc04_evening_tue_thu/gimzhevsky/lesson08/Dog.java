package by.it.sc04_evening_tue_thu.gimzhevsky.lesson08;

public class Dog {
    String name;
    int age;
    private int weight;
    private double power;

    public void setName(String name){
        this.name = name;
    }
    public String getName (){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge () {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }

    public void setPower(double power) {
        this.power = power;
    }
    public double getPower() {
        return power;
    }

    public String toString() {
            String result = String.format("Кличка: %s. Возраст: %d",this.name, this.age);
        return result;
    }

    boolean win (Dog otherDog){
        double chance1 = 0.2 * this.age + 0.3 * this.weight + 0.5 * this.power;
        double chance2 = 0.2 * otherDog.age + 0.3 * otherDog.weight + 0.5 * otherDog.power;
        if (chance1>chance2)
            return true;
        else
            return false;
    }
}
