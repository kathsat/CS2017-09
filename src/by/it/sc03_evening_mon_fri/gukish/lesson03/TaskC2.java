package by.it.sc03_evening_mon_fri.gukish.lesson03;

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
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int a=sc.nextInt();
        System.out.println(a+i);
        System.out.println(Integer.toBinaryString(a+i)}
    }


}
