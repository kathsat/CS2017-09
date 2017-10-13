package by.it.sc03_evening_mon_fri.halaevanika.lesson05;

/*

День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше 7 или меньше 1 – вывести «такого дня недели не существует».


Требования:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введено число от 1 до 7, необходимо вывести день недели.
4. Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.
5.  Нельзя использовать массивы или коллекции Java.

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует

 */

import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод:");
        int n = sc.nextInt();
        sc.close();
        if(n == 1) {
            System.out.println("понедельник");
        }
        else if(n == 2){
            System.out.println("вторник");
        }
        else if(n == 3){
            System.out.println("среда");
        }
        else if(n == 4){
            System.out.println("четверг");
        }
        else if(n == 5){
            System.out.println("пятница");
        }
        else if(n == 6){
            System.out.println("суббота");
        }
        else if(n == 7){
            System.out.println("воскресенье");
        }
        else
            {

        System.out.println("такого дня недели не существует");
        }
    }

}
