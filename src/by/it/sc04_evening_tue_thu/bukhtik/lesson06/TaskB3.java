package by.it.sc04_evening_tue_thu.bukhtik.lesson06;

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
        int N =sc.nextInt();
        int sample [] = new int [N];
        int min;
        int max;

        int sum = 0;
        double avg;
        if (N>0){
            for (int i = 0; i < N; i++) {
                sample [i] = sc.nextInt();
            }

            min = max = sample[0];

            for (int i = 1; i < N; i++) {
                if (sample[i] < min) min = sample [i];
                if (sample [i] > max) max = sample [i];
            }

            for (int i = 0; i < N; i++) {
                sum += sample [i];
            }
            avg = (double )sum / N;

            System.out.println("Minimum = " + min);
            System.out.println("Maximum = " + max);
            System.out.println("Average = " + avg);

        }


    }


}
