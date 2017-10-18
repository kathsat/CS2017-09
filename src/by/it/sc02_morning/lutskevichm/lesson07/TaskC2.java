package by.it.sc02_morning.lutskevichm.lesson07;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/


import java.util.ArrayList;
import java.util.Scanner;

public class TaskC2 {
    //Напишите тут ваш код
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr [i]= sc.nextInt();
        }
        sort(arr);
        for (int x : arr) {
            System.out.println(x);
        }
    }



    private static void sort(int[] array) {
        //Напишите тут ваш код

        for (int j = 1; j < 20; j++) {
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] < array[i+1]) {
                    int sort = array[i];
                    array[i] = array[i+1];
                    array[i+1] = sort;
                }
            }
        }
    }

}
