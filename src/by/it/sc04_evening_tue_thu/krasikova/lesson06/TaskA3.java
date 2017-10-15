package by.it.sc04_evening_tue_thu.krasikova.lesson06;
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
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int vert=1;
        for (;vert<=size;vert++) {
            char a='A';
            int hor=1;
            while (hor<=vert) {
                System.out.print(a);
                hor++;
                a++; 
            }
            System.out.println();
        }

    }

}
