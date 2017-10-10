package by.it.sc04_evening_tue_thu.shinkevich.lesson04;

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

class  TaskB2
{
        public static void main(String[] args) {
            System.out.println("Ввод:");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            double d = (b * b) - (4 * a * c);
            double e, f ;
            System.out.println("Вывод:");
            if (d > 0) {
                e = ((-1 * b) + (float) Math.sqrt(d)) / (2 * a);
                f = ((-1 * b) - (float) Math.sqrt(d)) / (2 * a);
                System.out.println( + e + " " + f);

            } else {
                if (d == 0) {
                    e = -1 * (b / (2 * a));
                    System.out.println(+e);
                } else {
                    System.out.println("Отрицательный дискриминант");
                }
            }}
 }