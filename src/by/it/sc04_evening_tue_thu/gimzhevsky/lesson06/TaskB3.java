package by.it.sc04_evening_tue_thu.gimzhevsky.lesson06;

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


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskB3 {
    public static void main(String[] args) throws IOException {
        int n;
        int k;
        double av;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());
        k = Integer.parseInt(reader.readLine());
        int min = k;
        int max = k;
        int sum = k;
        int counter = 1;
        for (int i = 1; i<n; i++){
            k=Integer.parseInt(reader.readLine());
            counter++;
            if (k<min)min=k;
            if (k>max)max=k;
            sum=sum+k;
        }
        av = (double)sum/n;
        System.out.println("Minimum = " + min);
        //System.out.println("Minimum = 0");
        System.out.println("Maximum = " + max);
        System.out.println("Average = " + av);
    }
}