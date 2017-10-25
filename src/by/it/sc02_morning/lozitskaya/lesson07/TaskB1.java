package by.it.sc02_morning.lozitskaya.lesson07;
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
        ArrayList <String> list = new ArrayList<>(5);
        list.add("first string");
        list.add("second string");
        list.add("third string");
        list.add("forth string");
        list.add("fifth string");
        System.out.println(list.size());
        for (int i=0; i<list.size(); i++){
            System.out.println(i);
        }
    }
}
