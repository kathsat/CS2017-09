package by.it.sc04_evening_tue_thu.sushchenja.lesson04;

/*
Lesson 04. Task A1. Калькулятор.
Напишите программу, которая считывает с клавиатуры два целых числа a и b
после этого выводит через пробел:

сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (результат выводится как тип int).

после этого еще раз выводит через пробел
сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (но результат выводится как тип double).

Для считывания данных с клавиатуры используйте метод nextInt() объекта класса Scanner.
Создать Scanner можно так:
Scanner sc=new Scanner(System.in);

Требования:
1. В программе необходимо создать объект типа Scanner.
2. Программа должна считывать два числа типа int с клавиатуры.
3. Программа должна дважды выводить в строку пять чисел через пробел.
4. Программа должна выводить int сумму, разность, произведение, частное и отстаток от деления этих чисел двух чисел.
4. Программа должна выводить double сумму, разность, произведение, частное и отстаток от деления этих чисел двух чисел.

Пример:

Ввод:
7 2
Вывод:
9 5 14 3 1
9.0 5.0 14.0 3.5 1.0

 */

import java.util.Scanner;

class TaskA1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a, b;
        a=sc.nextInt();
        b=sc.nextInt();
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        int g=a%b;
        double a1=a;
        double b1=b;
        double c1=a1+b1;
        double d1=a1-b1;
        double e1=a1*b1;
        double f1=a1/b1;
        double g1=a1%b1;
        System.out.println(c+" "+d+" "+e+" "+f+" "+g);
        System.out.println(c1+" "+d1+" "+e1+" "+f1+" "+g1);
    }

}
