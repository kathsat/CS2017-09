package by.it.sc04_evening_tue_thu.krasikova.lesson04;

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
    public static double dis(int x, int y, int z) {
        double d = y * y - (4 * x * z);
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Ввод:");
        System.out.println(a + " " + b + " " + c);
        double k1=(-(b)-Math.sqrt(dis(a, b, c)))/(2*a);
        double k2=(-(b)+Math.sqrt(dis(a, b, c)))/(2*a);
        double k3=(-(b))/(2*a);
        if (dis(a, b, c)>0) System.out.println(k2+" "+k1);
        if (dis(a, b, c)==0) System.out.println(k3);
        if (dis(a, b, c)<0) System.out.println("Отрицательный дискриминант");
    }
}
