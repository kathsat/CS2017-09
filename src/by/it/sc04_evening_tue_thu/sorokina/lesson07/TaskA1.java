package by.it.sc04_evening_tue_thu.sorokina.lesson07;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 целых чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.

Например, для такого ввода
1 2 3 4 5 6 7 8 9 0

вывод ожидается такой
0
9
8
7
6
5
4
3
2
1

*/


import java.util.Scanner;

public class TaskA1 {
    public static void main( String[] args ) {


            int numbers[];
            numbers = new int[10];

        Scanner sc=new Scanner(System.in);


       /*     for(int a=0;a<10;a++){
                numbers[a] = sc.nextInt();

            }
            for(int b=0; b<10; b++){
                System.out.println(numbers[9-b]);
            }*/
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();}

            int[] reverse = new int[numbers.length];

            for (int j = 0; j < numbers.length; j++) {
                reverse[numbers.length-j-1] = numbers[j];
            }
            for (int i1 : reverse) {
                System.out.println(i1);

            }
        }
    }


