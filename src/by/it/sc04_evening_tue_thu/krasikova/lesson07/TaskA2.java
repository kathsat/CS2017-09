package by.it.sc04_evening_tue_thu.krasikova.lesson07;

import java.util.ArrayList;

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
import java.util.Scanner;

public class TaskA2 {
    public static void main (String args[]) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while (true) {
            String line=sc.next();
            if (line.equals("END")) break;
            arr.add(line);
        }
        System.out.println(arr);
        /*System.out.println(arr.size());
        for (String s : arr) {
            System.out.println(s+" ");*/

        }

    }


