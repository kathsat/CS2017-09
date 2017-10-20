package by.it.sc03_evening_mon_fri.kalita.lesson07;
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

public class TaskB1 {
    public static void main(String[] args) throws IOException {
        String[] str=new String[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i=0;
        for (i = 0;i<5;i++) {
            str[i] = reader.readLine();
            System.out.println(str[i].length() + " " + str[i]);
        }

    }

}
