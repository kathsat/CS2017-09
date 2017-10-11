package by.it.sc04_evening_tue_thu.bayramova.lesson05;

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
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int days = day;
        switch(month) {
            case 1:
                break;
            case 2:
                days+=31;
                break;
            case 3:
                days+=31+28;
                break;
            case 4:
                days+=31+28+30;
                break;
            case 5:
                days+=31+28+31+30;
            case 6:
                days+=31+28+31+30+31;
                break;
            case 7:
                days+=31+28+31+30+31+30;
                break;
            case 8:
                days+=31+28+31+30+31+30+31;
                break;
            case 9:
                days+=31+28+31+30+31+30+31+31;
                break;
            case 10:
                days+=31+28+31+30+31+30+31+31+30;
                break;
            case 11:
                days+=31+28+31+30+31+30+31+31+30+31;
                break;
            case 12:
                days+=31+28+31+30+31+30+31+31+30+31+30;
                break;

        }
        System.out.println(days);
    }


}
