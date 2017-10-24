package by.it.sc03_evening_mon_fri.mironchik.lesson07;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/


import java.util.Scanner;

public class TaskC2 {
    //Напишите тут ваш код
    public static void main(String[] args) {
        int m[] =new int[20];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < m.length; i++) {
            m[i]=sc.nextInt();
            System.out.print(m[i]+" ");
        }
        sort(m);
    }

    public static void sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = t;
                }
            }
        }
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

}
