package by.it.sc04_evening_tue_thu.runec.lesson05;

import java.util.Scanner;

/*
На входе вводится число и месяц 2017 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ввод:");
        int day = s.nextInt();
        int month = s.nextInt();
        System.out.println("Вывод:");
        if(month==1)
            System.out.println(day);
        else if(month==2)
            System.out.println(31+day);
        else if(month==3)
            System.out.println(31+28+day);
        else if(month==4)
            System.out.println(31+28+31+day);
        else if(month==5)
            System.out.println(31+28+31+30+day);
        else if(month==6)
            System.out.println(31+28+31+30+31+day);
        else if(month==7)
            System.out.println(31+28+31+30+31+30+day);
        else if(month==8)
            System.out.println(31+28+31+30+31+30+31+day);
        else if(month==9)
            System.out.println(31+28+31+30+31+30+31+31+day);
        else if(month==10)
            System.out.println(31+28+31+30+31+30+31+31+30+day);
        else if(month==11)
            System.out.println(31+28+31+30+31+30+31+31+30+31+day);
        else if(month==12)
            System.out.println(31+28+31+30+31+30+31+31+30+31+30+day);
        else
            System.out.println();

    }
}