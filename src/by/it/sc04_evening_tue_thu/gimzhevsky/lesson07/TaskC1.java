package by.it.sc04_evening_tue_thu.gimzhevsky.lesson07;
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
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TaskC1 {
        public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] m = new int[20];
        for (int i = 0; i<20; i++){
            m[i]=Integer.parseInt(reader.readLine());
        }
        ArrayList firstList = new ArrayList();
        ArrayList secondList = new ArrayList();
        ArrayList thirdList = new ArrayList();
        for (int i = 0; i<20; i++){
            boolean added = false;
            if (m[i]%3==0) {
                firstList.add(m[i]);
                added=true;
            }
            if (m[i]%2==0) {
                secondList.add(m[i]);
                added=true;
            }
            if (added==false) thirdList.add(m[i]);
        }
        printList(firstList);
        printList(secondList);
        printList(thirdList);
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}
