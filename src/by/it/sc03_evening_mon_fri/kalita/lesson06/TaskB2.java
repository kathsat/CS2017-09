package by.it.sc03_evening_mon_fri.kalita.lesson06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Новый способ ввода данных + поиск минимума

Текущая реализация:
Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.

Новая задача:
Программа вводит пять чисел с клавиатуры (через Enter) и выводит минимальное из них на экран.

Требования:
1. Программа должна считывать числа с клавиатуры.
2. Программа должна выводить строку, которая начинается на "Minimum = ".
3. Программа должна выводить строку, которая заканчивается минимальным из 5 введенных чисел.
*/

public class TaskB2 {
    public int num(BufferedReader out) throws Exception{
        return Integer.parseInt(out.readLine());
    }
    public static void main(String[] args) throws Exception {
        TaskB2 b2=new TaskB2();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min=b2.num(reader);
        for (int i = 0; i <4 ; i++) {
          min= min(b2.num(reader), min);
        }

       // int minimum = min;//min(min(min(min(a,b),c),d),e);

        System.out.println("Minimum = " + min);
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }
}
