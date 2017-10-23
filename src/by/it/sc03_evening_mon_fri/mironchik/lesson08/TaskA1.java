package by.it.sc03_evening_mon_fri.mironchik.lesson08;

public class TaskA1 {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        Dog dog2=new Dog();
        dog1.setName("Шарик");
        dog2.setName("Тузик");
        dog1.setAge(5);
        dog2.setAge(3);
        System.out.println(dog1.getName()+" "+dog1.getAge());
        System.out.println(dog2.getName()+" "+dog2.getAge());
    }
}
