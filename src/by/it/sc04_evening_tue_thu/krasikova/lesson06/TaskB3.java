package by.it.sc04_evening_tue_thu.krasikova.lesson06;

/*
Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N, которое должно быть больше 0
2. потом вводит N чисел с консоли типа int
3. выводит на экран максимальное, минимальное и среднее арифметическое из введенных N чисел.


Требования:
1. Программа должна считывать числа с клавиатуры.
2. Программа должна выводить строку "Minimum = " минимальное число в формате int.
3. Программа должна выводить строку "Maximum = " максимальное число в формате int.
4. Программа должна выводить строку "Average = " среднее арифметическое в формате double.
 */


import java.util.Scanner;
import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.MAX_VALUE;

public class TaskB3 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int maximum = MIN_VALUE;
        int minimum = MAX_VALUE;
        int sum = 0;

        for (int a = 0; a < n; a++) {
            int number = sc.nextInt();
            minimum = Math.min(number, minimum);
            maximum = Math.max(number, maximum);
            sum = sum+number;
        }
        double average=(sum/(double) n);

        System.out.println("Minimum = " + minimum);
        System.out.println("Maximum = " + maximum);
        System.out.println("Average = " + average);


    }
}
