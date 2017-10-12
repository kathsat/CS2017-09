package by.it.sc02_morning.bondarenko.lesson05;

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
        switch (month) {
            case 12:
                day = day + 30;
            case 11:
                day = day + 31;
            case 10:
                day = day + 30;
            case 9:
                day = day + 31;
            case 8:
                day = day + 31;
            case 7:
                day = day + 30;
            case 6:
                day = day + 31;
            case 5:
                day = day + 30;
            case 4:
                day = day + 31;
            case 3:
                day = day + 28;
            case 2:
                day = day + 31;
            }
        System.out.println(day);
    }
}
