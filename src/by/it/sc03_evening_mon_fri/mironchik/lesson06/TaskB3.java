package by.it.sc03_evening_mon_fri.mironchik.lesson06;

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
        int N;
        do {
            System.out.println("Введите число > 0: ");
            Scanner sc = new Scanner(System.in);
            N = sc.nextInt();
        }
        while (N<0);
        System.out.println("Введите "+N+" чисел: ");
        int [] ar=new int[N];

        for (int i=0; i<N; i++) {
            Scanner sc = new Scanner(System.in);
            ar[i] = sc.nextInt();
        }
        int max=ar[0], min=ar[1];
        double s=0;
        for (int i=0; i<N; i++) {
            if(ar[i]>max) max=ar[i];
            if(ar[i]<min) min=ar[i];
            s+=ar[i];
        }
        System.out.println("Minimum = "+min);
        System.out.println("Maximum = "+max);
        System.out.println("Average = "+s/N);
    }

}
