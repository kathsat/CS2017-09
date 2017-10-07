package by.it.sc02_morning.davydov.lesson04;

import java.util.Scanner;

/*
Lesson 04. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
class TaskB2 {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        int aa=scann.nextInt();
        int bb=scann.nextInt();
        int cc=scann.nextInt();


        if (aa==0) System.out.println ("a=0, решения не существует");

        if (dis (aa,bb,cc) > 0) System.out.println ((Math.sqrt(dis (aa,bb,cc)) - bb) / (2 * aa) + " " + ((- Math.sqrt(dis (aa,bb,cc)) - bb) / (2 * aa))  );
        if (dis (aa,bb,cc) == 0) System.out.println ((Math.sqrt(dis (aa,bb,cc)) - bb) / (2 * aa));
        if (dis (aa,bb,cc) < 0) System.out.println ("Отрицательный дискриминант");
    }

     private static double dis (int a, int b, int c) {
        return (b * b) - (4 * a * c);
     }



}
