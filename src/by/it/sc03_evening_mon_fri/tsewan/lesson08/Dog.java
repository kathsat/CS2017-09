package by.it.sc03_evening_mon_fri.tsewan.lesson08;

public class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Кличка: "+name+". Возраст: "+age;
    }
}
