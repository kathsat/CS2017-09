package by.it.sc02_morning.menchytsky.lesson06;
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
        long g = 1;
        //9223372036854775807
                while(true){
            if(fact(g)<0){
                g--;
                System.out.printf("%d = %x = %s", fact(g), fact(g), Long.toBinaryString(fact(g)));
                break;
            }
            else  g++;
                }

    }
    private static long fact(long k){
        long i = 1;
        for(long j=1 ; j<=k ; j++){
            i=i*j;
        }
        return i;
    }
}
