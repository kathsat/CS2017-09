package by.it.sc02_morning.opanovich.lesson05;

import java.util.Calendar;
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

        int YEAR = 2017;
        int month, day;

        Scanner rd = new Scanner(System.in);

        day = rd.nextInt();
        month = rd.nextInt();

        Calendar date = Calendar.getInstance();
        date.set(YEAR, month - 1, day);

        if (day == 0 && month == 1) {
            System.out.println(0);
        } else {
            System.out.println(date.get(Calendar.DAY_OF_YEAR));
        }
    }
}
