package by.it.sc02_morning.opanovich.lesson06;
/*
Треугольник из $
Прочитать переменную size с клавиатуры

Используя цикл for вывести на экран
прямоугольный треугольник из букв алфавита (ENGLISH), начиная с буквы A со сторонами size * size.

Пример
Ввод: 10
Вывод:
$
$$
$$$
$$$$
$$$$$
$$$$$$
$$$$$$$
$$$$$$$$
$$$$$$$$$
$$$$$$$$$$

*/

import java.util.Scanner;

public class TaskA3 {

    public static void main(String[] args) {

        Scanner rd = new Scanner(System.in);
        int size = rd.nextInt();
        char A = 'A';

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (A + j));
            }
            System.out.println();
        }
    }
}
