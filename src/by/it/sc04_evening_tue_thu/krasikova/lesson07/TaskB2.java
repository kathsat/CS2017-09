package by.it.sc04_evening_tue_thu.krasikova.lesson07;

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
import java.util.Arrays;
import java.util.Scanner;

public class TaskB2 {
    public static void main (String args[]) {
        int m[]=new int[20];
        Scanner sc=new Scanner(System.in);

        for (int i=0; i < m.length; i++) {
            int l = sc.nextInt();
            m[i]= l;
        }

        int a[] = new int[10];
        int b[] = new int[10];
        for (int z = 0; z < m.length; z++) {
            if (z <10) {
                a[z]=m[z];
            } else b[z-10]=m[z];
        }
        System.out.println("a="+ Arrays.toString(a));
        System.out.println("b="+Arrays.toString(b));



    }

}
