package by.it.sc04_evening_tue_thu.tokun.lesson05;

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
                int a = sc.nextInt();
                int b = sc.nextInt();
                switch (b) {
                    case 1:
                        System.out.println(a);
                        break;
                    case 2:
                        System.out.println(a+31);
                        break;
                    case 3:
                        System.out.println(a+59);
                        break;
                    case 4:
                        System.out.println(a+90);
                        break;
                    case 5:
                        System.out.println(a+120);
                        break;
                    case 6:
                        System.out.println(a+151);
                        break;
                    case 7:
                        System.out.println(a+181);
                        break;
                    case 8:
                        System.out.println(a+212);
                        break;
                    case 9:
                        System.out.println(a+243);
                        break;
                    case 10:
                        System.out.println(a+273);
                        break;
                    case 11:
                        System.out.println(a+304);
                        break;
                    case 12:
                        System.out.println(a+334);
                        break;

                }
    }

}
