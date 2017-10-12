package by.it.sc02_morning.striga.lesson05;

/*

День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше 7 или меньше 1 – вывести «такого дня недели не существует».


Требования:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введено число от 1 до 7, необходимо вывести день недели.
4. Если введено число не входящее в интервал от 1 до 7,
    то вывести уведомление что такого дня недели не существует.
5.  Нельзя использовать массивы или коллекции Java.

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует



for(day = 1; day <=7)
switch (i) {
case 1:
System
break;
 */

import java.util.Scanner;

public class TaskA2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();


            if (day == 1)
                System.out.println("понедельник");
            else if (day == 2)
                System.out.println("вторник");
            else if (day == 3)
                System.out.println("среда");
            else if (day == 4)
                System.out.println("четверг");
            else if (day == 5)
                System.out.println("пятница");
            else if (day == 6)
                System.out.println("суббота");
            else if (day == 7)
                System.out.println("воскресенье");
            else
                System.out.println("такого дня недели не существует");
        }
    }

