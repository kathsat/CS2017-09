package by.it.sc04_evening_tue_thu.runec.lesson07;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int data[] = new int[20];
        int a,b,t;
        for (int i = 0; i < data.length; i++) {
            data[i]=s.nextInt();
        }

        for(a=1; a < data.length; a++)
            for(b=data.length-1; b >= a; b--) {
                if(data[b-1] < data[b]) { // if out of order exchange elements
                    t = data[b-1];
                    data[b-1] = data[b];
                    data[b] = t;
                }
            }
//

        for(int i=0; i < data.length; i++)
            System.out.println( data[i]);
        System.out.println();


    }





    public static void sort(int[] array) {

    }

}