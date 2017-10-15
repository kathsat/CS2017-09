package by.it.akhmelev.lesson07;
/*
Создайте 5 различных строчек в списке
1. Создайте список строк.
2. Добавьте в него 5 различных строчек.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.util.List;

public class TaskB1 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("Привет1");
        arr.add("Привет2");
        arr.add("Привет3");
        arr.add("Привет4");
        arr.add("Привет5");
        System.out.println(arr.size());
        for (int i = 0; i < 5; i++) {
            System.out.println(arr.get(i));
        }
    }
}
