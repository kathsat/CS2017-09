package by.it.sc03_evening_mon_fri.kalita.lesson08;

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
    public static Dog input() {
        Dog d = new Dog();
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
            if (in.hasNextLine()) {
                d.setName(in.nextLine());
                break;
            }
        while (in.hasNext())
            if (in.hasNextInt()) {
                d.setAge(in.nextInt());
                break;
            }
        while (in.hasNextInt())
            if (in.hasNextInt()) {
                d.setWeight(in.nextInt());
                break;
            }
        while (in.hasNextDouble())
            if (in.hasNextDouble()) {
                d.setPower(in.nextDouble());
                break;
            }
           return d;
    }

    public static void main(String[] args) {

        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Scanner in = new Scanner(System.in);
        String[] str = new String[8];
        for(int i=0;i<8;i++){
            str[i] =in.nextLine();
        }
        d1.setName(str[0]);
        d1.setAge(Integer.parseInt(str[1]));
        d1.setWeight(Integer.parseInt(str[2 ]));
        d1.setPower(Double.parseDouble(str[3].replace(",",".")));
        d2.setName(str[4]);
        d2.setAge(Integer.parseInt(str[5]));
        d2.setWeight(Integer.parseInt(str[6 ]));
        d2.setPower(Double.parseDouble(str[7].replace(",",".")));
        System.out.println(d1.win(d2) ? d1.getName() : d2.getName());

    }

}
