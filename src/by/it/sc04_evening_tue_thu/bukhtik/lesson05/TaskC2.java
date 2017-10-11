package by.it.sc04_evening_tue_thu.bukhtik.lesson05;

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
        int a = sc.nextInt();  // число
        int b = sc.nextInt();  // месяц

        if (b==1) System.out.println(a);
        if (b==2) System.out.println(31+a);
        if (b==3) System.out.println(59+a);
        if (b==4) System.out.println(90+a);
        if (b==5) System.out.println(120+a);
        if (b==6) System.out.println(151+a);
        if (b==7) System.out.println(181+a);
        if (b==8) System.out.println(212+a);
        if (b==9) System.out.println(243+a);
        if (b==10) System.out.println(273+a);
        if (b==11) System.out.println(304+a);
        if (b==12) System.out.println(334+a);

    }




}
