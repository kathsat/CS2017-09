package by.it.sc02_morning.liplianina.lesson06;
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
        char ch = 65;

        for (int i = 0; i < size; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(ch);
                ch = (char) (ch + 1);
            }
            ch = 65;
            System.out.println();


        }

    }
}
