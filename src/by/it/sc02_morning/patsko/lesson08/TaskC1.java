package by.it.sc02_morning.patsko.lesson08;

/*
Доработайте класс Dog.

1) Добавьте два новых поля с геттерами и сеттерми (!!!!)
private int weight; //вес собаки
private double power; //сила укуса собаки

2) Напишите экземплярный метод в классе Dog
boolean win(Dog otherDog)
    {... тело метода...}
который рассчитывает, кто из двух собак победит эта (this) или та (otherDog).

Расчет должен быть таким.
    Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.

Побеждает та собака, у которой больше шансов на победу.
Если победила эта (this), то метод win возвращает true, иначе false

3) Проверка.
В классе TaskC1 с клавиатуры через Scanner водятся две собаки в формате
кличка возраст вес сила
кличка возраст вес сила
(всего получается 8 чтений разных данных)

Создайте этих собак, определите победителя с помощью созданного
в классе Dog метода boolean win(Dog dog).
Напечатайте кличку победителя.
*/


import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Dog[] dogs=new Dog[2];
        for(int i=0;i<dogs.length;i++) {
            dogs[i]=new Dog();
            System.out.print("Введите кличку собаки\n");        dogs[i].setName(sc.nextLine());
            System.out.print("Введите возраст собаки\n");       dogs[i].setAge(sc.nextInt());
            System.out.print("Введите вес собаки\n");           dogs[i].setWeight(sc.nextInt());
            System.out.print("Введите силу укуса собаки\n");    dogs[i].setPower(sc.nextDouble());
            sc.nextLine();  //для считывания остатка строки: "\n" после sc.nextDouble()
        }
        System.out.println((dogs[0].win(dogs[1]))?dogs[0].getName():dogs[1].getName());
    }

}
