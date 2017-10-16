package by.it.sc04_evening_tue_thu.Tovstik.lesson06;

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

public class TaskB3 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);


        int n ;
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int sum = 0;

        n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                minimum = Math.min(x, minimum);
                maximum = Math.max(x, maximum);
                sum += x;
            }

        System.out.println("Minimum = " + minimum);
        System.out.println("Maximum = " + maximum);
        System.out.println("Average = " + sum / (double) n);
    }
}
