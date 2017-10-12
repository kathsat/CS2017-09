package by.it.sc02_morning.opanovich.lesson06;

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

        int n, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;
        Scanner rd = new Scanner(System.in);

        n = rd.nextInt();

        for (int i = 0; i < n; i++) {
            int temp = rd.nextInt();
            min = Math.min(temp, min);
            max = Math.max(temp, max);
            sum += temp;
        }

        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.println("Average = " +  sum / (double) n);
    }
}
