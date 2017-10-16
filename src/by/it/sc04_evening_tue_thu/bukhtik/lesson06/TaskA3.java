package by.it.sc04_evening_tue_thu.bukhtik.lesson06;
/*
Треугольник из $
Прочитать переменную size с клавиатуры

Используя цикл for вывести на экран
прямоугольный треугольник из букв алфавита (ENGLISH), начиная с буквы A со сторонами size * size.

Пример
Ввод: 10
Вывод:
A
AB
ABC
ABCD
ABCDE
ABCDEF
ABCDEFG
ABCDEFGH
ABCDEFGHI
ABCDEFGHIJ
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int i;
        int j;


        for (i = 0; i<size; i++){
            char x = 'A';
            for (j = i; j<size; j++){

                System.out.print(x);
                x++;
                }
            System.out.println();

        }

    }

}
