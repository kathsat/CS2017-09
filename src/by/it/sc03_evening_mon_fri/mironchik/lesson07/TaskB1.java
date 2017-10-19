package by.it.sc03_evening_mon_fri.mironchik.lesson07;
/*
Создайте 5 различных строчек в списке
1. Создайте список строк.
2. Добавьте в него 5 различных строчек.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.
*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("q");
        list.add("qw");
        list.add("qwe");
        list.add("qwer");
        list.add("qwert");
        System.out.println(list.size());
        for (int i=0; i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }
}
