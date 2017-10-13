package by.it.sc03_evening_mon_fri.kalita.lesson06;

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


import com.sun.org.apache.xml.internal.security.algorithms.JCEMapper;

import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size = in.nextInt();
        int num = in.nextInt();
        int min= num, max=num, Average = num, sum=num;
        for (int i = 0; i < size-1; i++) {

            num=in.nextInt();
           min= Math.min(min,num);
           max = Math.max(max,num);
            sum+=num;
        }
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = "+max);
        System.out.println("Average = "+((double)sum/size));
    }

}
