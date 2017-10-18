package by.it.sc04_evening_tue_thu.gimzhevsky.lesson07;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskC2 {
    //Напишите тут ваш код
    int t;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] m = new int[20];
        for (int i = 0; i<20; i++){
            m[i]=Integer.parseInt(reader.readLine());
        }
        sort(m);
    }

    public static void sort(int[] array) {
        for (int a = 0; a<20; a++){
            for (int b = 19; b>a; b--){
                int c = array[b];
                int d = array[b-1];
                if (c>d){
                    int t = array[b-1];
                    array[b-1] = array[b];
                    array[b] = t;
                }
            }
        }
        for (int i = 0; i<20; i++)System.out.println(array[i]);
    }
}
