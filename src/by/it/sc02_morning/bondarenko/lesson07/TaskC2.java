package by.it.sc02_morning.bondarenko.lesson07;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        int i;
        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] array) {
        int i, j, k;
        for (i = array.length; i >= 0; i--) {
            for (j = 0; j < i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;
                }
            }
        }
    }
}
