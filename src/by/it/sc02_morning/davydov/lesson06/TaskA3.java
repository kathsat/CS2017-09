package by.it.sc02_morning.davydov.lesson06;
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
        Scanner scccc = new Scanner(System.in);
        int size = scccc.nextInt();
        char let = 'A';
        int L_cur = 1;
        int L_max = 1;


        for (int i = 1; i <= size;) {


            if (L_cur != L_max) {
                System.out.print(let);
                let += 1;
                L_cur++;
            }
            else {System.out.println(let);
            i++;
            let = 'A';
            L_max++;
            L_cur=1;

            }


        }





    }


}
