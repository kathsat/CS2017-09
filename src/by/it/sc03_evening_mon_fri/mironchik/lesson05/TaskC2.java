package by.it.sc03_evening_mon_fri.mironchik.lesson05;

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
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] m={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i=0; i<k; i++) {
            n += m[i];
        }
        System.out.println(n);
    }
}
