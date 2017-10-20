package by.it.sc03_evening_mon_fri.halaevanika.lesson07;

/*
Один большой массив и два маленьких
1. Создать массив m на 20 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива a и b на 10 целых чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
    вторую половину во второй маленький.
5. Вывести массивы a и b на экран командами:
        System.out.println("a="+Arrays.toString(a));
        System.out.println("b="+Arrays.toString(b));

Например, для такого ввода
1 2 3 4 5 6 7 8 9 10 11 22 33 44 55 66 77 88 99 0

ожидается такой вывод:
a=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
b=[11, 22, 33, 44, 55, 66, 77, 88, 99, 0]

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskB2 {
    public static void main(String[] args) throws Exception {
        int[] array1 = new int[20];
        int[] array2 = new int[10];
        int[] array3 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<array1.length;i++){
            array1[i]=Integer.parseInt(reader.readLine());
        }
        System.out.print("a=[");
        for (int i=0;i<array2.length -1;i++){
            array2[i]=array1[i];
            System.out.print(array2[i]+ ", ");
        }
        for (int i=array2.length -1;i<array2.length;i++){
            array2[i]=array1[i];
            System.out.print(array2[i]);
        }
        System.out.println("]");
        System.out.print("b=[");
        for (int i=0;i<array3.length - 1;i++) {
            array3[i] = array1[i + 10];
            System.out.print(array3[i] + ", ");
        }
        for (int i=array3.length - 1;i<array3.length ;i++) {
            array3[i] = array1[i + 10];
            System.out.print(array3[i]);
        }
        System.out.println("]");
    }

}
