package by.it.sc04_evening_tue_thu.krasikova.lesson05;

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
    public static void main (String args[]) {
        System.out.println("Ввод:");
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        int month=sc.nextInt();
        System.out.println("Вывод:");
        int number=0;
        if (month==1) {number=day;}
            else if (month==2) {number=31+day;}
            else if (month==3) {number=31+28+day;}
            else if (month==4) {number=31+28+31+day;}
            else if (month==5) {number=31+28+31+30+day;}
            else if (month==6) {number=31+28+31+30+31+day;}
            else if (month==7) {number=31+28+31+30+31+30+day;}
            else if (month==8) {number=31+28+31+30+31+30+31+day;}
            else if (month==9) {number=31+28+31+30+31+30+31+31+day;}
            else if (month==10) {number=31+28+31+30+31+30+31+31+30+day;}
            else if (month==11) {number=31+28+31+30+31+30+31+31+30+31+day;}
            else if (month==12) {number=31+28+31+30+31+30+31+31+30+31+30+day;}
        System.out.println(number);


    }

}

