package by.it.sc03_evening_mon_fri.kalita.lesson06;
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
    public static long fact(int k){
        long max=1L;
        long out=0;
        for (int i=1;; i++) {

            /*if(Long.MAX_VALUE/2>Long.MAX_VALUE-max){
                break;
            }*/
            if(max<0)break;

           // System.out.println(max + " " +i);
            out=max;
            max*=i;
        }
        return out;
    }
    public static void main(String[] args) {
      int k=1;
      long l=1L;
      int i=1;
       /* for (;i<30; i++) {
            k*=i;
            System.out.println(k+" "+i);
        }*/
        //fact(k)
        System.out.printf("%d=%x=%s", fact(k), fact(k), Long.toBinaryString(fact(k)));
    }

}
