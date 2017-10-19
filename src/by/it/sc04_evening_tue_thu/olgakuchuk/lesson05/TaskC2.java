package by.it.sc04_evening_tue_thu.olgakuchuk.lesson05;

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
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;
        int i = 3;

        if (y == 1)
            System.out.println(x);
        else  if (y==2)
            System.out.println(31+28+x);

/*
            for (i<y; y<=12; i++) {
                sum = y * 30 +i-3;
                System.out.println(sum);
                i++;
            }

    }


       /* if (y==1)
        System.out.println(x);
        else if (y==2)
            System.out.println(31+28+x);
        else if (y>3 && y<=12) {
            sum=y*31+(y-1)*30-2+x;
        System.out.println(sum);}

       /*
        if (y==1)
            System.out.println(x);
         else if (y==3 || y==5 || y==7 || y==8 || y==10 )
        {   sum=31*y+30*(y-2)+28+x;
        System.out.println(sum);}

        else
            if (y==2)
            System.out.println(31+28+x);
         else if (y==12)
                System.out.println();
        else
                System.out.println(30*y++x);   */







    }}


