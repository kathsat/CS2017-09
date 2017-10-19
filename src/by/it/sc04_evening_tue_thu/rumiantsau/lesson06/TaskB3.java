package by.it.sc04_evening_tue_thu.rumiantsau.lesson06;

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
        int minimum = 0;
        int maximum = 0;
        int sm = 0;
        double average = 0;

        for (int i = 1; i <= N; i++) {
            int tpNum = sc.nextInt();

            sm = sm + tpNum;

            if (i == 1) {
                minimum = tpNum;
                maximum = tpNum;
                continue;
            }

            minimum = min(minimum, tpNum);
            maximum = max(maximum, tpNum);
        }
        average = (double) sm / N;

        System.out.println("Minimum = " + minimum);
        System.out.println("Maximum = " + maximum);
        System.out.println("Average = " + average);
    }

    private static int min(int a, int b) { return (a < b) ? a : b; }
    private static int max(int a, int b) { return (a < b) ? b : a; }
}

