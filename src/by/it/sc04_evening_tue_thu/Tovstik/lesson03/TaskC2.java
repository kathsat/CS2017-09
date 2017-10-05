package by.it.sc04_evening_tue_thu.Tovstik.lesson03;



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

import java.util.Scanner;


class TaskC2 {
    public static void main(String[] args) {
        System.out.println("Ввод");
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a + b;

        System.out.println("");
        System.out.println("Вывод:");
        System.out.println("DEC:" + Integer.toString(a) + "+" + Integer.toString(b) + "=" + Integer.toString(result));
        System.out.println("BIN:" + Integer.toBinaryString(a) + "+" + Integer.toBinaryString(b) + "=" + Integer.toBinaryString(result));
        System.out.println("HEX:" + Integer.toHexString(a) + "+" + Integer.toHexString(b) + "=" + Integer.toHexString(result));
        System.out.println("OCT:" + Integer.toOctalString(a) + "+" + Integer.toOctalString(b) + "=" + Integer.toOctalString(result));

    }

}
