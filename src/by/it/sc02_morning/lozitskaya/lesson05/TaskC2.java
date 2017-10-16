package by.it.sc02_morning.lozitskaya.lesson05;

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
        int i = sc.nextInt();
        int j = sc.nextInt();
        switch (j){
            case 1:
                System.out.println(i);
                break;
            case 2:
                System.out.println(31+i);
                break;
            case 3:
                System.out.println(31+28+i);
                break;
            case 4:
                System.out.println(31*2+28+i);
                break;
            case 5:
                System.out.println(31*2+28+30+i);
                break;
            case 6:
                System.out.println(31*3+28+30+i);
                break;
            case 7:
                System.out.println(31*3+30*2+28+i);
                break;
            case 8:
                System.out.println(31*4+30*2+28+i);
                break;
            case 9:
                System.out.println(31*5+30*2+28+i);
                break;
            case 10:
                System.out.println(31*5+30*3+28+i);
                break;
            case 11:
                System.out.println(31*6+30*3+28+i);
                break;
            case 12:
                System.out.println(31*6+30*4+28+i);
                break;
        }
    }
}
