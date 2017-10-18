package by.it.sc04_evening_tue_thu.bayramova.lesson07;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        int a[] = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<a.length; i++) {
            a[i]=sc.nextInt();
        }
        a=sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }
    //Напишите тут ваш код





    public static int[] sort(int[] array) {
        for (int i=0; i< array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

}
