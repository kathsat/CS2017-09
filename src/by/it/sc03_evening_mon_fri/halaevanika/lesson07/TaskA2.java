package by.it.sc03_evening_mon_fri.halaevanika.lesson07;





import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
public class TaskA2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {//в бесконечном цикле проверяем условия и выполняем
            String s = reader.readLine();
            if (s.equals("END")) break;
            else list.add(s);

        }
        System.out.print("[");
        for (int i = 0; i < list.size()-1; i++) {

            System.out.print(list.get(i) + ", "); }
        for (int i = list.size()-1; i < list.size(); i++){
            System.out.print(list.get(i));
        }
            System.out.println("]");


    }
}