package by.it.sc02_morning.menchytsky.lesson07;
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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);

        List<Integer> bigList = new ArrayList<>();
        for(int i=0; i<20; i++){
            bigList.add(sc.nextInt());
        }
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        List<Integer> thirdList = new ArrayList<>();
        for(int y=0; y<bigList.size(); y++){
            if(bigList.get(y)%3==0 || bigList.get(y)%2==0 ){
                if(bigList.get(y)%3==0) firstList.add(bigList.get(y));
                if(bigList.get(y)%2==0) secondList.add(bigList.get(y));
            }
            else thirdList.add(bigList.get(y));

        }
        printList(firstList);
        printList(secondList);
        printList(thirdList);
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}
