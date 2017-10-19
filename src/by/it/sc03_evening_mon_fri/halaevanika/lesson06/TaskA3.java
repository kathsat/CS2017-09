package by.it.sc03_evening_mon_fri.halaevanika.lesson06;
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

import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char с='A';
        for (int i=1; i<=size; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(с);
                с++;
            }
            System.out.println("");
            с='A';
        }

    }
}