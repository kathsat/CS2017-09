package by.it.sc02_morning.liplianina.lesson05;

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

        int monthday = 0;
        int sum;

        for (int i = 1; i < month; i++) {
            if (i <= 7) {
                if (i % 2 != 0) monthday = monthday + 31;
                else if (i % 2 == 0 && i != 2) monthday = monthday + 30;
                else monthday = monthday + 28;
            }
            else {
                if (i % 2 != 0) monthday = monthday + 30;
                else monthday = monthday + 31;
            }
        }
        sum = monthday + day;
        System.out.println(sum);
    }

}
