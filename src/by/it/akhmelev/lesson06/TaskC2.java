package by.it.akhmelev.lesson06;

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
        long res=fact(20);
        String s=res+" = "+Long.toHexString(res)+" = "+Long.toBinaryString(res);
        System.out.println(s);
    }

    private static long fact(int k){
        long res=1;
        for (int i = 1; i <= k; i++) {
            res=res*i;
        }
        return res;
    }

}
