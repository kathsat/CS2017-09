package by.it.sc02_morning.liplianina.lesson06;

import java.math.BigInteger;

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
        int k = 0;
        long max = (long) (Math.pow(2.0, 63.0) - 1);
        while (Long.compareUnsigned(fact(k), max) <= 0) k++;
        String binary = Long.toBinaryString(fact(k - 1));
        String hex = Long.toHexString(fact(k - 1));
        System.out.println(fact(k - 1) + "=" + hex + "=" + binary);
    }


    private static long fact(int k) {
        long fact = k;
        if (k == 0) return 1;
        for (int i = 1; i < k; i++) fact = fact * i;
        return fact;
    }
}
