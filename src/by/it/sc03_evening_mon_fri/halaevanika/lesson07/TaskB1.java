package by.it.sc03_evening_mon_fri.halaevanika.lesson07;
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
        // добавим в список ряд элементов
        list.add("Германия");
        list.add("Франция");
        list.add("Великобритания");
        list.add("Испания");
        list.add("Италия");
        int k = list.size();
        System.out.println(k);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
