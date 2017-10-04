package by.it.sc04_evening_tue_thu.olgakuchuk.lesson03;

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
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("DEC:" + a + "+" + b + "=" + c);

        String a2 = Integer.toBinaryString(a);
        String b2 = Integer.toBinaryString(b);
        String c2 = Integer.toBinaryString(c);
        System.out.println("BIN:" + a2 + "+" + b2 + "=" + c2);


        String a8 =  Integer.toHexString(a);
        String b8 =  Integer.toHexString(b);
        String c8 =  Integer.toHexString(c);
        System.out.println("HEX:" + a8 + "+" + b8 + "=" + c8);


        String a16 = Integer.toOctalString(a);
        String b16 = Integer.toOctalString(b);
        String c16 = Integer.toOctalString(c);
        System.out.println("OKT:" + a16 + "+" + b16 + "=" + c16);


    }
}