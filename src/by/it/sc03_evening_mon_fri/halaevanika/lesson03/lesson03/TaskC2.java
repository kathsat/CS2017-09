package by.it.sc03_evening_mon_fri.halaevanika.lesson03.lesson03;

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        sc.close();
        int dec = number1 + number2;
        System.out.println("Ввывод:");
        System.out.println("DEC:" + number1 + "+" + number2 + "=" + dec);
        System.out.println("BIN:" + Integer.toBinaryString(number1) + "+" + Integer.toBinaryString(number2) +
        "=" + Integer.toBinaryString(dec));
        System.out.println("HEX:" + Integer.toHexString(number1) + "+" + Integer.toHexString(number2) +
        "=" + Integer.toHexString(dec));
        System.out.println("OKT:" + Integer.toOctalString(number1) + "+" + Integer.toOctalString(number2) +
        "=" + Integer.toOctalString(dec));
    }

}
