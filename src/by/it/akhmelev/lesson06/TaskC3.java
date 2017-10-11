package by.it.akhmelev.lesson06;

/*
Головоломка. Одно выражение.

С клавиатуры введено число типа long с помощью Scanner.
Определите, является ли это число степенью двойки.
Если да, то выведите Yes, иначе выведите No.

Не используя операторов for, while, if, switch, рекурсии,
методов и внешних классов (кроме Scanner).

Вы можете заменить в коде только фразу "Ваше выражение".

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
        String res=((n&(n-1))==0)?"YES":"NO";
                //"Вместо этой строки тут нужно ввести выражение";
        System.out.println(res);
    }

}
