package by.it.sc04_evening_tue_thu.sorokina.lesson07;

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

import java.util.ArrayList;
import java.util.Scanner;

public class TaskB2 {
    public static void main( String[] args ) {
        ArrayList<String> big = new ArrayList<>();
        ArrayList<String> small1 = new ArrayList<>();
        ArrayList<String> small2 = new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        String bigNumber;

        for (int i = 0; i < 20; i++) {
            bigNumber = sc.nextLine();
            big.add(i,bigNumber);
        }
        int size = big.size();
        for(int i=0; i<size/2; i++){
            small1.add(i,big.get(i));
        }
        System.out.println("a="+small1);

        for(int i=0; i<size/2; i++){
            small2.add(i,big.get(10+i));
        }
        System.out.println("b="+small2);
    }

}
