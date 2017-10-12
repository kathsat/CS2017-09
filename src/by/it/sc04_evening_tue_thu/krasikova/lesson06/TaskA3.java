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
        char a='A';
        for (int dif=0;dif<size;dif+=1) {
            System.out.print(a+=dif);     //dif=1

        }

    }

}
