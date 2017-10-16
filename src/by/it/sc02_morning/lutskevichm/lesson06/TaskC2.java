package by.it.sc02_morning.lutskevichm.lesson06;

import java.util.Scanner;

/*
Головоломка.

1) Напишите статический метод fact(int k) для вычисления факториала числа.

2) Напишите программу, которая рассчитает максимальное значение k,
при котором факториал k без искажений поместится в тип данных long.

3) Выведите на экран найденный (максимально возможный для long) факториал
в десятичном, шестандцатиричном и двоичном виде (через знак равно, без пробелов).

Например, если найденное число k было бы равно 6, то вывелось бы
720 = 2d0 = 1011010000

Но правильное число k и сам факториал конечно будут больше.

 */
public class TaskC2 {
    public static void main(String[] args) {
        int j=1;
        long i;
        do {
            i=fact(j++);
        }
        while (fact(j)>0);
        System.out.println(i + " = " + Long.toHexString(i) + " = " + Long.toBinaryString(i));
    }
    private static long fact(int k) {
        long b = 1;
        for (int a = 1; a <= k; a++) {
            b = b* a;
        }
            return b;

    }

}
