package by.it.sc02_morning.sinitsyna.lesson08;

public class Dog {
    private String name;
    private int age;
    private int weight;
    private double power;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    @Override
    public String toString() {
//        String result=String.format(
        //               "Кличка": %s. Возраст: %d
        //       )
        return super.toString();
    }
}

