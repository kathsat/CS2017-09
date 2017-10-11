package by.it.sc02_morning.golikov.lesson05;

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
import java.util.Scanner;
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int month = sc.nextInt();
       int i = date;
       int j = month;
       if (j == 1)
           System.out.println(date);
       if (j == 2)
           System.out.println(date + 28);
        if (j == 3)
            System.out.println(date + 59);
        if (j == 4)
            System.out.println(date + 90);
        if (j == 5)
            System.out.println(date + 120);
        if (j == 6)
            System.out.println(date + 151);
        if (j == 7)
            System.out.println(date + 181);
        if (j == 8)
            System.out.println(date + 212);
        if (j == 9)
            System.out.println(date + 243);
        if (j == 10)
            System.out.println(date + 273);
        if (j == 11)
            System.out.println(date + 304);
        if (j == 12)
            System.out.println(date + 334);
    }
}
