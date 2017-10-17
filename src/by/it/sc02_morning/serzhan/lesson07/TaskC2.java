package by.it.sc02_morning.serzhan.lesson07;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = sc.nextInt();
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {

        int buf;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    buf = array[j];
                    array[j] = array[i];
                    array[i] = buf;
                }
            }
        }
    }

}


