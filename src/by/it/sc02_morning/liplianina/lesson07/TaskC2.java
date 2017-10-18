package by.it.sc02_morning.liplianina.lesson07;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskC2 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            String s = reader.readLine();
            arr[i] = Integer.parseInt(s);
            }
        sort(arr);
        for (int x : arr) System.out.println(x);
    }





    public static void sort(int[] array) {
        for (int i = 1; i < (array.length); i++) {
            for (int j = 0; j < (array.length - i); j++) {
                if (array[j] < array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
    }

}
