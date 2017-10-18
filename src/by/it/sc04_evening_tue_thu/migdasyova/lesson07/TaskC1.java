package by.it.sc04_evening_tue_thu.migdasyova.lesson07;
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
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arrRest = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            arr.add(sc.nextInt());
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 3 == 0) {
                arr3.add(arr.get(i));
            }
            if (arr.get(i) % 2 == 0) {
                arr2.add(arr.get(i));
            }
            if (arr.get(i) % 3 != 0 && arr.get(i) % 2 != 0) {
                arrRest.add(arr.get(i));
            }
        }
        printList(arr3);
        printList(arr2);
        printList(arrRest);
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }
}
