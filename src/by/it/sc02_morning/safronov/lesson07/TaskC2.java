package by.it.sc02_morning.safronov.lesson07;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TaskC2 {
    //Напишите тут ваш код
    public static void main(String[] args) {
        int[] list = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        sort(list);
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.println(list[i]);

        }
    }


    //    public static void sort(int[] list) {
    public static void sort(int[] list) {
        //Напишите тут ваш код
        int a, b, c, size;
        size = list.length;
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (list[b - 1] > list[b]) {
                    c = list[b - 1];
                    list[b - 1] = list[b];
                    list[b] = c;
                }
            }
    }
}


