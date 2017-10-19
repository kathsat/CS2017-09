package by.it.sc02_morning.patsko.lesson06;

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


import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.print("N=");
        int N, min=0, max=0;
        double sum=0;
        N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            if(i==0) min=max=arr[i];
            else {
                if (min > arr[i]) min = arr[i];
                if (max < arr[i]) max = arr[i];
            }
            sum+=arr[i];
        }
        for(int i=0;i<N;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("\nMinimum = " + min + "\nMaximum = " + max+"\nAverage = " + sum/N);

//        DecimalFormat df=new DecimalFormat("0.0###########");
//        String fs=String.format("\nMinimum = "+min+"\nMaximum = %d\nAverage = "+df.format((double)sum/N), max).replace(",",".");
//        System.out.println(fs);
    }
}
