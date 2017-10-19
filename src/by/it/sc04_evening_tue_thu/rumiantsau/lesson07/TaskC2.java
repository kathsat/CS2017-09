package by.it.sc04_evening_tue_thu.rumiantsau.lesson07;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] vec = new int[20];

        for (int i = 0; i < vec.length; i++) {
            vec[i] = sc.nextInt();
        }

        sort(vec);

        for (int value : vec) {
            System.out.println(value);
        }
    }

    public static void sort(int[] array) {
        int temp;
        for (int i = 1; i <= array.length - 1; i++){
            for (int j = 1; j <= array.length - i; j++){
                if (array[j - 1] < array[j]) {
                  temp = array[j - 1];
                  array[j - 1] = array[j];
                  array[j] = temp;
                }
            }
        }
    }

}
