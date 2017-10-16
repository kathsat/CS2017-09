package by.it.sc02_morning.lutskevichm.lesson06;

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

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minimum = 0;
        for (int i=0; i<5; i++) {
            int a = Integer.parseInt(reader.readLine());
            minimum=(i != 0 ? min(minimum, a): a);
        }
        System.out.println("Minimum = " + minimum);
    }

    private static int min(int a, int b) {
        return a <= b ? a : b;
    }
}
