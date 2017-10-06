package by.it.sc03_evening_mon_fri.kravchinskaja_.lesson03;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {
    private static int Sum;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        int myint1 = keyboard.nextInt();
        System.out.println("enter an integer");
        int myint2 = keyboard.nextInt();

        System.out.println ("Sum = "+(myint1+myint2));


}}
