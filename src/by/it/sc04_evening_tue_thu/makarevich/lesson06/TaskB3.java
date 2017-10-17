package by.it.sc04_evening_tue_thu.makarevich.lesson06;

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
                 int a=sc.nextInt();
                 int [] numbers = new int [a];
        for (int i = 0; i<a;i++) {
            numbers[i]=sc.nextInt();
        }

        int min=numbers[0];
        for (int i = 0; i <a; i++) {
            if (numbers[i]<=min) min=numbers[i];
        }
        System.out.println("Minimum = "+min);

        int max=0;
        for (int i = 0; i < a; i++) {
            if (numbers[i]>=max) max=numbers[i];
        }
        System.out.println("Maximum = "+max);

        int sum=0;
        for (int i = 0; i <a ; i++) {
            sum=sum+numbers[i];
        }
        double average=(double)sum/a;
        System.out.println("Average = "+average);
    }
}
