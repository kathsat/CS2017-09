package by.it.sc04_evening_tue_thu.sushchenja.lesson07;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a[] = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i]=s.nextInt();
        }
        sort(a);
        for(int i=0; i < a.length; i++)
            System.out.println( a[i]);
        System.out.println();
    }//Напишите тут ваш код
    public static void sort(int[] a) {
        int b,c,d;
        for(b=1; b < a.length; b++)
            for(c=a.length-1; c >= b; c--) {
                if(a[c-1] < a[c]) {
                    d = a[c-1];
                    a[c-1] = a[c];
                    a[c] = d;
                }
            }   //Напишите тут ваш код
    }

}
