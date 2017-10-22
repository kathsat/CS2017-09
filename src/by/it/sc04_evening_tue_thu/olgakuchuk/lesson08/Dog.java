package by.it.sc04_evening_tue_thu.olgakuchuk.lesson08;

/**
 * Created by Olga on 10/19/17.
 */
public class Dog {

    private String name;
    private int age;
    private int weight; //вес собаки
    private double power; //сила укуса собаки

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


    boolean win(Dog otherDog)
    {

        return this.calculateChanceToWin()>otherDog.calculateChanceToWin();
    }

    public double calculateChanceToWin() {   // this.   Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.

        return  0.2 * age + 0.3 * weight + 0.5 * power;

    }


   String getName (){
    return this.name;
    }


    void setName (String name) {

        this.name=name;
    }

    int getAge(){
        return age;
    }

    void setAge (int age){

        this.age=age;
    }


    public String toString (){

        //return "Кличка: "+name+ ". Возраст: "+age;
       String result = String.format("Кличка: %s. Возраст: %d",name,age);

       return result;
    }

}
