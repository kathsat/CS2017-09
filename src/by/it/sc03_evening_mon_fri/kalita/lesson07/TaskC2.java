package by.it.sc03_evening_mon_fri.kalita.lesson07;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TaskC2 {
    //Напишите тут ваш код

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];
        for (int i=0;i<20;i++) {
            arr[i]=Integer.parseInt(reader.readLine());
        }
        sort(arr);
        for (int i=19;i>=0;i--) { System.out.println(arr[i]);

        }

    }



    public static void sort(int[] array) {
        //Напишите тут ваш код
       /* int tmp=array[0];
        for(int i =0;i<20;i++)
        {if(array[i]<tmp)
        {*/
            Arrays.sort(array);//Arrays.

    }

}
