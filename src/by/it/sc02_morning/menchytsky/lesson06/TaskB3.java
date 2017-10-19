package by.it.sc02_morning.menchytsky.lesson06;

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
    public static void main(String[] args)  {

        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        double sum = 0;
        int y = 0;
        int z = 2147483647 ;

        for (int i = 1; i <= a; i++) {
            int b = sc.nextInt();
            sum += b;
            if(b>=y) y=b;

            if(b<=z) z=b;

        }
        System.out.println("Minimum = " + z);
        System.out.println("Maximum = " + y);
        System.out.println("Average = " + (sum/a));


    }
}
