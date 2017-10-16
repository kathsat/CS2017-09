package by.it.sc04_evening_tue_thu.Tovstik.lesson06;
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
        int size0 = sc.nextInt();
        int b = 64;
        int size = size0 + (char)b;
        char ch = (char) size;


        for (char i = 'A'; i <= ch; i++) {

            for (char j = 'A'; j <= i; j++){
                System.out.print(j);
            }


            System.out.println();
        }
    }

}
