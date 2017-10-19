package by.it.sc04_evening_tue_thu.krasikova.lesson07;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/
import java.util.Scanner;

public class TaskC2 {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int prog[]= new int[20];
        for (int i=0; i < prog.length; i++) {
            int l = sc.nextInt();
            prog[i]=l;
        }
        sort(prog);}

    public static void sort(int[] array) {
        for (int a=1; a < array.length; a++) {
            for (int b = array.length-1; b >= a; b--) {
                if (array[b-1] < array[b]) {
                    int t= array[b-1];
                    array[b-1]=array[b];
                    array[b]=t;
                }
            }
        }
        for (int x : array) {
            System.out.println(x);
        }
    }

}
