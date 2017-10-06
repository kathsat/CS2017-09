package by.it.sc03_evening_mon_fri.liubimov_pavel.lesson03;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Ввод:
34 26

Вывод:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OKT:42+32=74
*/
class TaskC2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввод:");
        int i = in.nextInt();
        int a = in.nextInt();
        System.out.println("Вывод:");
        System.out.println("DEC:"+ i + "+" +  a + "=" + (a + i));
        System.out.println("BIN:"+ Integer.toBinaryString((i))+ "+" + Integer.toBinaryString((a)) + "=" +Integer.toBinaryString((a+i)));

    }


}
