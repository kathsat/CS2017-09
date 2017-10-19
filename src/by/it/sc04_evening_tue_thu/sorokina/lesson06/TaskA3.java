package by.it.sc04_evening_tue_thu.sorokina.lesson06;
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
    public static void main( String[] args ) {
       Scanner sc=new Scanner(System.in);
            int size=sc.nextInt();
/*
            char a = 65;
            char b;
            int j=0;

while (j<size) {

    for (int i = j; i < size; i--) {
        b = (char) ((int) (a) + i);
        System.out.print(b);
    }
    j++;
    System.out.println();
}

*/char a = 65;
        char b;
   for (int i = 0; i<size; ++i)
   {

           for(int x = 0; x<=i;++x){
               b = (char) ((int) (a) + x);
               System.out.print(b);


       }
       System.out.println();
   }

}
}
