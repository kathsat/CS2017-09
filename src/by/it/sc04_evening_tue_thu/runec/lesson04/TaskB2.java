package by.it.sc04_evening_tue_thu.runec.lesson04;

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

import java.util.Scanner;
    class TaskB2 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Ввод:");
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int D = b*b-4*a*c;
            System.out.println("Вывод:");
            if(D<0)System.out.println("Отрицательный дискриминант");
            if(D==0)System.out.println((double) (-1*b/(2*a)));
            if(D>0) System.out.println((-1*b-Math.sqrt(D))/(2*a)+" "+(-1*b+Math.sqrt(D))/(2*a));

        }
    }

