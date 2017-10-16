package by.it.sc02_morning.liplianina.lesson06;

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N <= 0) System.exit(0);
        int a = sc.nextInt();
        int c = a;
        int sum = a;

        for (int i = 1; i < N; i++) {
            int b = sc.nextInt();
            a = min(a, b);
            c = max(c, b);
            sum = sum + b;

        }

        System.out.println("Minimum = " + a);
        System.out.println("Maximum = " + c);
        System.out.println("Average = " + ((double) sum / (double) N));
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }

    private static int max(int a, int b) { return a > b ? a : b; }
  }
