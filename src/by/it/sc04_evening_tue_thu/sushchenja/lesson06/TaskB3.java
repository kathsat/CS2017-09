package by.it.sc04_evening_tue_thu.sushchenja.lesson06;

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
        Scanner sc=new Scanner(System.in);
        int N, min, max, sum;
        N=sc.nextInt();
        min = 0;
        max= 0;
        sum=0;
        for (int i=0; i<N; i++) {
            int a = sc.nextInt();
            if (i > 0) {
                if (min <= a);
                else min = a;
            } else min = a;
            if (i>0) {
                if (max <= a)
                    max = a;

            } else max = a;
            sum=sum+a;
        }
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.println("Average = " + (double)sum/N);
    }
}
