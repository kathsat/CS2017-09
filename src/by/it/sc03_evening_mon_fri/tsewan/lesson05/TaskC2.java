package by.it.sc03_evening_mon_fri.tsewan.lesson05;

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
        int jun=31;
        int feb=28;
        int mar=31;
        int apr=30;
        int may=31;
        int juny=30;
        int july=31;
        int aug=31;
        int sep=30;
        int oct=31;
        int nov=30;
        int dec=31;
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        int month=sc.nextInt();
        switch (month) {
            case 1:
                System.out.println(day);
                break;
            case 2:
                System.out.println(day+jun);
                break;
            case 3:
                System.out.println(day+jun+feb);
                break;
            case 4:
                System.out.println(day+jun+feb+mar);
                break;
            case 5:
                System.out.println(day+jun+feb+mar+apr);
                break;
            case 6:
                System.out.println(day+jun+feb+mar+apr+may);
                break;
            case 7:
                System.out.println(day+jun+feb+mar+apr+may+juny);
                break;
            case 8:
                System.out.println(day+jun+feb+mar+apr+may+juny+july);
                break;
            case 9:
                System.out.println(day+jun+feb+mar+apr+may+juny+july+aug);
                break;
            case 10:
                System.out.println(day+jun+feb+mar+apr+may+juny+july+sep+aug);
                break;
            case 11:
                System.out.println(day+jun+feb+mar+apr+may+juny+july+sep+oct+aug);
                break;
            case 12:
                System.out.println(day+jun+feb+mar+apr+may+juny+july+sep+oct+nov+aug);
                break;
        }

    }

}
