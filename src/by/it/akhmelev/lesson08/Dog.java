package by.it.akhmelev.lesson08;

public class Dog {


    public Dog() {
    }

    public Dog(String name, int age, int weight, double power) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.power = power;
    }

    boolean win(Dog other){
        //Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.
        double w=0.2*age+0.3*weight+0.5*power;
        double wo=0.2*other.age+0.3*other.weight+0.5*other.power;
        return  w>wo;
    }


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


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Кличка: "+name + ". Возраст: " +age;
    }


//    public String toString() {
//        return "Dog{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", weight=" + weight +
//                ", power=" + power +
//                '}';
//    }
}
