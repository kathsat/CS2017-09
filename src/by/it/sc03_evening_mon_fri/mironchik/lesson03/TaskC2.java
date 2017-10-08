package by.it.sc03_evening_mon_fri.mironchik.lesson03;
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
        System.out.println("Введите 2 числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res=a+b;

        String bin1 = Integer.toBinaryString(a);
        String bin2 = Integer.toBinaryString(b);
        String res1 = Integer.toBinaryString(res);
        String oct1 = Integer.toOctalString(a);
        String oct2 = Integer.toOctalString(b);
        String res2 = Integer.toOctalString(res);
        String hex1 = Integer.toHexString(b);
        String hex2 = Integer.toHexString(b);
        String res3 = Integer.toHexString(res);
        System.out.println("DEC:" + a + "+" + b + "=" + res);
        System.out.println("BIN:" + bin1 + "+" + bin2 + "=" + res1);
        System.out.println("HEX:" + hex1 + "+" + hex2 + "=" + res3);
        System.out.println("OKT:" + oct1 + "+" + oct2 + "=" + res2);
    }

}
