package by.it.sc03_evening_mon_fri.mironchik.lesson07;

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
import java.io.InputStreamReader;


public class TaskA1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int ar[]=new int[10];
        for (int i=0; i<ar.length; i++) {
            String s=reader.readLine();
            ar[i]=Integer.parseInt(s);
        }
        for (int i=ar.length-1; i>=0; i--) {
            System.out.println(ar[i]);
        }
    }
}
