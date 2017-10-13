package by.it.sc02_morning.bondarenko.lesson06;
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
        int i=1;
        long n;
        do
            n = fact(i++);
        while (fact(i)>0);
        System.out.printf("%d = %x = %s%n",n,n,Long.toBinaryString(n));
    }
    private static long fact(int k) {
        long f=1;
        for (int i=1;i<=k;i++)
            f = f * i;
        return f;
    }

}
