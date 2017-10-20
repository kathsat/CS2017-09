package by.it.sc03_evening_mon_fri.gukish.lesson06;
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
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskA3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        for ( char i = 'A'; i <a ; i++)
        {
            for (char j = 'A'; j < a; j++) {
                System.out.print(i+j);
            }
            System.out.println();
        }
    }
}
