package by.it.sc04_evening_tue_thu.shinkevich.lesson06;
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

public class TaskA3
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        for (int m = 1; m <=size ; m++)
        {
            char result='A';
            for (int n = 1; n <=m ; n++)
            {
                System.out.print(result++);
            }
            System.out.println();
        }
    }
}
