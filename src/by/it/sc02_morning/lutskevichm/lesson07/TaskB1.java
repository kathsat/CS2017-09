package by.it.sc02_morning.lutskevichm.lesson07;
/*
Создайте 5 различных строчек в списке
1. Создайте список строк.
2. Добавьте в него 5 различных строчек.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int j = 0; j < 5; j++) {
            String s = reader.readLine();
            list.add(s);
        }
        System.out.println(list.size());
        for (String aList : list) System.out.println(aList);
    }
}
