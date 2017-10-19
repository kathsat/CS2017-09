package by.it.sc04_evening_tue_thu.makarevich.lesson07;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/


import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        int [] mas=new int[20];
         Scanner sc=new Scanner(System.in);

        for (int a = 0; a < mas.length; a++) {
            mas[a]=sc.nextInt();
        }

        for (int i = 1; i < mas.length; i++) {
            for (int j = 1; j<=mas.length-i ; j++) {
                if (mas[j]>mas[j-1]) {
                    int tmp = mas[j-1];
                    mas[j-1]=mas[j];
                    mas[j]=tmp;
                };
            }
        }
        for (int a : mas) {
            System.out.println(a);
        }

    }








}
