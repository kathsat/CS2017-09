package by.it.sc04_evening_tue_thu.migdasyova.lesson03;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println ("Ввод:");
        System.out.println(a + " " + b );
        System.out.println ("Вывод:");
        System.out.println ("Sum = " + c);

    }


}
