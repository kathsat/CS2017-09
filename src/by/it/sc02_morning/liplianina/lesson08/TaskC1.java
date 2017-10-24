package by.it.sc02_morning.liplianina.lesson08;

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


import java.io.IOException;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog[] dogs = {dog1, dog2};

        for(int x = 0; x < dogs.length; x++) {
            dogs[x].setName(sc.next());
            dogs[x].setAge(sc.nextInt());
            dogs[x].setWeight(sc.nextInt());
            dogs[x].setPower(sc.nextDouble());
        }
        System.out.println(dog1.win(dog2) ? dog1.getName(): dog2.getName());
    }

}
