package by.it.sc04_evening_tue_thu.krasikova.lesson07;
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
import java.io.Reader;
import java.util.ArrayList;


public class TaskB1 {
    public static void main(String args[])  throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        ArrayList<String> list=new ArrayList();
        for (int i=0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        System.out.println(list.size());
        for (String i : list) {
            System.out.println(i);

        }

    }

}
