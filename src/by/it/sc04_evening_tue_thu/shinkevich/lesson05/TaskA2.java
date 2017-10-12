package by.it.sc04_evening_tue_thu.shinkevich.lesson05;

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

 */

import java.io.IOException;
import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args)
            throws IOException
    {
            Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
            if (num == 1)
            {
                System.out.print("понедельник");
            }
            else if (num == 2)
            {
                System.out.print("вторник");
            }
            else if (num == 3)
            {
                System.out.print("среда");
            }
            else if (num == 4)
            {
                System.out.print("четверг");
            }
            else if (num == 5)
            {
                System.out.print("пятница");
            }
            else if (num == 6)
            {
                System.out.print("суббота");
            }
            else if (num == 7)
            {
                System.out.print("воскресенье");
            }
            else
            {
                System.out.print("такого дня недели не существует");
            }
    }
}
