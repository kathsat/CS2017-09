package by.it.sc02_morning.opanovich.lesson07;
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

    public static void main(String[] args) throws Exception {

        List<Integer> arrayInput = new ArrayList<>();
        List<Integer> array3 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();
        List<Integer> arrayAll = new ArrayList<>();

        Scanner rd = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            arrayInput.add(rd.nextInt());
        }

        for (int i = 0; i < arrayInput.size(); i++) {
            if (arrayInput.get(i) % 2 == 0) {
                array2.add(arrayInput.get(i));
            }
            if (arrayInput.get(i) % 3 == 0) {
                array3.add(arrayInput.get(i));
            }
            if (arrayInput.get(i) % 2 != 0 && arrayInput.get(i) % 3 != 0) {
                arrayAll.add(arrayInput.get(i));
            }
        }

        printList(array3);
        printList(array2);
        printList(arrayAll);
    }

    private static void printList(List<Integer> list) {

        for (Integer aList : list) {
            System.out.println(aList);
        }
    }


}
