package by.it.akhmelev.lesson07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Создайте список строк.
Вводите строки с клавиатуры, пока пользователь не введет слово END.
Каждую введенную строку, кроме слова END добавьте в список типа ArrayList.

Напечатайте список, не используйте для этого цикл.
Список - это объект. Его можно просто напечатать, как переменную.

Для вот такого ввода:
ONE
TWO
THREE
FOUR
FIVE
END
Ожидается такой вывод:
[ONE, TWO, THREE, FOUR, FIVE]

*/
public class TaskA3 {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        while (true) {
            String s = scanner.next();
            if (s.equals("END")) break;
            l.add(s);
        }
        System.out.println(l);
    }

}
