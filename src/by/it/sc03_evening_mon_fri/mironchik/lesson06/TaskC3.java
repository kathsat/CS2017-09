package by.it.sc03_evening_mon_fri.mironchik.lesson06;
/*
Головоломка. Одно выражение.

С клавиатуры вводится положительное число типа long.
Определите, является ли это число степенью двойки.
Если да, то выведите Yes, иначе выведите No.

Вы можете заменить в коде только фразу "Ваше выражение".
Для выбора между "Yes" и "No" допускается использование тернарного оператора

Не используйте операторов for, while, if, switch, рекурсии,
методов и внешних классов (кроме Scanner).

Пример:

Ввод:
65536
Вывод:
Yes

Ввод:
777
Вывод:
No

*/

import java.util.Scanner;


public class TaskC3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        System.out.println((n & (n-1))==0 ? "YES" : "NO");
    }

}