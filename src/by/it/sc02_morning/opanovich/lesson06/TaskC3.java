package by.it.sc02_morning.opanovich.lesson06;
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
//        String res= (1L << Long.toBinaryString(n).length() - 1 == n) ? "Yes" : "No";
//        System.out.println(res);
        String res= (Long.highestOneBit(n) == n) ? "YES" : "NO";    // In task "Yes" "No" and in test is "YES" "NO"
        System.out.println(res);
    }

}
