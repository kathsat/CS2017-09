package by.it.sc04_evening_tue_thu.sorokina.lesson07;
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
    public static void main( String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listTriple = new ArrayList<>();
        ArrayList<Integer> listDouble = new ArrayList<>();
        ArrayList<Integer> listOther = new ArrayList<>();
        ArrayList<Integer> listTripleReverse = new ArrayList<>();
        ArrayList<Integer> listDoubleReverse = new ArrayList<>();
        ArrayList<Integer> listOtherReverse = new ArrayList<>();


        for (int i = 0; i < 20; i++) {

            list.add(sc.nextInt());
        }


        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%3==0 && list.get(i)%2==0) {
                listDouble.add(list.get(i));
                listTriple.add(list.get(i));
            }
            else if (list.get(i)%2==0) listDouble.add(list.get(i));
            else if (list.get(i)%3==0) listTriple.add(list.get(i));
            else listOther.add(list.get(i));

        }





        printList(listTriple);
       printList(listDouble);
        printList(listOther);

    }
    private static void printList( List<Integer> list ) {
        for (Integer aList : list) System.out.println(aList);
    }
}



