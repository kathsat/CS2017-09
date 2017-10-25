package by.it.sc02_morning.lozitskaya.lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
public class TaskA2 {
    public static void main(String[] args) throws IOException {
        ArrayList <String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.next();
            if(s.equals("END"))
                break;
            else list.add(s);
        }
        System.out.println(list);
        /*BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        for(int i=0; i<list.size(); i++){
            String s = reader.readLine();
            list.add(s);
            if(s.equals("END")) break;
            //else list.add(s);
        }
        System.out.println(list);*/
    }
}
