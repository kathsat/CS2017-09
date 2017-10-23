package by.it.sc03_evening_mon_fri.kalita.lesson07;

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
import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) throws IOException {
        int[] a = new int[10];
        /*BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");*/
        String[]s=new String[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < s.length; i++) {
            a[i]=in.nextInt();
        }
        for (int i=a.length-1;i>=0;i--) {
            System.out.println(a[i]);
        }
    }
}
/*        for (int x=0;x<a.length;x++  ) {
            a[x]=Integer.parseInt(in.readLine().split(" ")[0]);
            System.out.println(a[x]);

        }

    }
}
/* public int num(BufferedReader out) throws Exception{
        return Integer.parseInt(out.readLine());
    }
    public static void main(String[] args) throws Exception {
        TaskB2 b2=new TaskB2();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min=b2.num(reader);
        for (int i = 0; i <4 ; i++) {
          min= min(b2.num(reader), min);
        }
*/