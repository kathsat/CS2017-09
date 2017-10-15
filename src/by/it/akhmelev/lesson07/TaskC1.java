package by.it.akhmelev.lesson07;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TaskC1 {
    public static void main(String[] args) throws Exception
    {
        //add your code here
        //ArrayList<Integer> all = new ArrayList<Integer>();

        ArrayList<Integer> x2 = new ArrayList<>();
        ArrayList<Integer> x3 = new ArrayList<>();
        ArrayList<Integer> xx = new ArrayList<>();
        BufferedReader stin=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++)
        {
            int val = Integer.parseInt(stin.readLine());
            //all.add(val);
            if (val%2==0) x2.add(val);
            if (val%3==0) x3.add(val);
            if ((val%2!=0) && (val%3!=0)) xx.add(val);
        }
        printList(x3);
        printList(x2);
        printList(xx);
    }

    private static void printList(List<Integer> list) {
        //add your code here
        for (Integer aList : list) System.out.println(aList);
    }


}
