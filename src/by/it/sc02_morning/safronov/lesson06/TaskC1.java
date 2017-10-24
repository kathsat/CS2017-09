package by.it.sc02_morning.safronov.lesson06;

/*
Введите положительное число n с клавиатуры (допускаются числа от 0 до 62).

Выведите все степени двойки от 0-й до n-й.

Ограничение:
1) Операции умножения и возведения в степень в этой задаче запрещаются.
2) Двоичное представление числа должно формироваться до вывода в консоль.

Вывод сделайте в формате
двоичное число = десятичное число.
ВАЖНО! Разрядность двоичного числа должна быть равна n

Пример.

Ввод:
16
Ожидаемый вывод:
00000000000000001 = 1
00000000000000010 = 2
00000000000000100 = 4
00000000000001000 = 8
00000000000010000 = 16
00000000000100000 = 32
00000000001000000 = 64
00000000010000000 = 128
00000000100000000 = 256
00000001000000000 = 512
00000010000000000 = 1024
00000100000000000 = 2048
00001000000000000 = 4096
00010000000000000 = 8192
00100000000000000 = 16384
01000000000000000 = 32768
10000000000000000 = 65536

Ввод:
6

Вывод:
0000001 = 1
0000010 = 2
0000100 = 4
0001000 = 8
0010000 = 16
0100000 = 32
1000000 = 64

*/

import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); //требуемое число повторений, возведений в степень
        int i;                //фиктическое число прогонов
        int a=0;              //степень
        int n=2;              //исходная 2
        int w;
        for(i=0;i<=k;i++){
           w=(int) Math.pow(n,a);
            System.out.println(Integer.toBinaryString((int)w)+"="+w) ;
            a++;
        }
    }
}
    // Возведение в квадрат числа 3
//    int a1 = 3;
//    int b1 = 2;
//      System.out.printf("Число 3 в квадрате равно %.0f \n", Math.pow(a1, b1));
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int s1 = sc.nextInt();
//        int s2 = sc.nextInt();
//        int res = s1 + s2;
//        System.out.println("DEC:"+s1+"+"+s2+"="+res);
//        System.out.println("BIN:"+Integer.toBinaryString((int)s1)+"+"+Integer.toBinaryString((int)s2)+"="+Integer.toBinaryString((int) res));
//        System.out.println("HEX:"+Integer.toHexString((int)s1)+"+"+Integer.toHexString((int)s2)+"="+Integer.toHexString((int) res));
//        System.out.println("OKT:"+Integer.toOctalString((int)s1)+"+"+Integer.toOctalString((int)s2)+"="+Integer.toOctalString((int) res));
//
//
//
//    }