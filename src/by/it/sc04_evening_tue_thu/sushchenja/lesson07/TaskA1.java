package by.it.sc04_evening_tue_thu.sushchenja.lesson07;

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


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskA1 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] mas = new int[10];
        for (int i = 0; i <mas.length; i++) {
            String s = reader.readLine();
            mas[i] = Integer.parseInt(s);
        }
        int[] revers = new int[mas.length];
        for (int i = 0; i <mas.length ; i++) {
            revers[mas.length-i-1]=mas[i];
        }
        for (int value : revers) {
            System.out.println(value);
        }
        }
    }

