package by.it.sc02_morning.safronov.lesson06;
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
        int m = sc.nextInt();
        int b;
        char i;
        char k = 'A';

        for (b = 1; b <= m; b++) {
            for (i = 'A'; i <= k; i++) {
                System.out.print(i);
            }
            System.out.println();
            k++;
            i = 'a';
        }
    }
}

