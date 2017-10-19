package by.it.sc04_evening_tue_thu.runec.lesson07;
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
        Scanner s= new Scanner(System.in);
        int data[] = new int[20];
        for (int i = 0; i < data.length; i++) {
            data[i]=s.nextInt();
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i <data.length ; i++) arr.add(data[i]);

        ArrayList<Integer> three=new ArrayList<>();
        ArrayList<Integer>two=new ArrayList<>();
        ArrayList<Integer>another=new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            Integer x=arr.get(i);
            if(x%3==0){
                three.add(x);}
            if (x%2==0){
                two.add(x);}
            if(!(x%3==0)&!(x%2==0)){
                another.add(x);}}
        printList(three);
        printList(two);
        printList(another);
//
    }


    private static void printList(List<Integer> list) {

        for (Integer aList : list) System.out.println(aList); }

}
