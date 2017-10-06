package by.it.sc04_evening_tue_thu.makarevich.lesson03;

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

//это файл не компилировался, вызывая ошибки у всех.
//поэтому мне пришлось его изменить.
//теперь у вас из-за этого будет конфликт слияния.
//Хмелев. Подойдите на занятии, расскажу подробнее.

//проблема в этой строке:
//import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

class TaskC2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int a=sc.nextInt();
        int result = i+a;
        System.out.println("DEC"+":"+i+"+"+a+"="+result);
        System.out.println("BIN"+":"+Integer.toBinaryString(i)+"+"+Integer.toBinaryString(a)+"="+Integer.toBinaryString(result));
        System.out.println("HEX"+":"+Integer.toHexString(i)+"+"+Integer.toHexString(a)+"="+Integer.toHexString(result));
        System.out.println("OKT"+":"+Integer.toOctalString(i)+"+"+Integer.toOctalString(a)+"="+Integer.toOctalString(result));

    }



}
