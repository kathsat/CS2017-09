package by.it.sc04_evening_tue_thu.tokun.lesson07;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sort(array);
        for (int i = 0; i < 20 ; i++) {
            System.out.println(array[i]);
        }

    }

    public static void sort(int[] array) {

        for (int i = 1; i <array.length ; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if(array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

}
