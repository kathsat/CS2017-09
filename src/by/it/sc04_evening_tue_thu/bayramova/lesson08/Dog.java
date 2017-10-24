package by.it.sc04_evening_tue_thu.bayramova.lesson08;

class Dog {
    private String name;
    private int age;

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void setName(String name) {
        this.name=name;
    }

    void setAge(int age) {
        this.age=age;
    }

    public String toString() {
        return ("Кличка: "+name+". Возраст: "+age);
    }

    private int weight;
    private double power;

    int getWeight() {
        return weight;
    }
    double getPower() {
        return power;
    }

    void setWeight(int weight) {
        this.weight=weight;
    }
    void setPower(double power) {
        this.power=power;
    }

    public double chance() {
        return 0.2*age+0.3*weight+0.5*power;
    }

    public boolean win(Dog otherDog) {
     if (this.chance()>otherDog.chance()) {
         return true;
     }
     else {
         return false;
     }
    }




}
