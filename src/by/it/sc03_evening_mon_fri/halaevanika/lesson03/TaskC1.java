package by.it.sc03_evening_mon_fri.halaevanika.lesson03;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        sc.close();
        int sum = number1 + number2;
        System.out.println("Вывод:");
        System.out.println("Sum = " + sum);
    }

}
