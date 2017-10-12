package by.it.sc03_evening_mon_fri.kalita.lesson05;

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
        int day ;
        int month;
        Scanner in=new Scanner(System.in);
        day=in.nextInt();
        month=in.nextInt();
        int january=31, february=28,march=31,april =30,may=31 ,june=30 ,july=31,august=31, september=30, october=31, november=30, december=31;
        switch (month){
            case 1:
                System.out.println(day); break;
            case 2:
                System.out.println(january+day); break;
            case 3:
                System.out.println(january+february+day); break;
            case 4:
                System.out.println(january+february+march+day); break;
            case 5:
                System.out.println(january+february+march+april+day); break;
            case 6:
                System.out.println(january+february+march+april+may+day); break;
            case 7:
                System.out.println(january+february+march+april+may +june+day); break;
            case 8:
                System.out.println(january+february+march+april+may +june+july+day); break;
            case 9:
                System.out.println(january+february+march+april+may +june+july+august+day); break;
            case 10:
                System.out.println(january+february+march+april+may +june+july+august+september+day); break;
            case 11:
                System.out.println(january+february+march+april+may +june+july+august+september+october+day); break;
            case 12:
                System.out.println(january+february+march+april+may +june+july+august+september+october+november+day); break;
        }
    }

}
