package by.it.sc04_evening_tue_thu.migdasyova.lesson07;
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
        ArrayList<String> arr = new ArrayList<>();
        arr.add(0, "when yot talk,");
        arr.add(1, "you are only repeating ");
        arr.add(2, "what you already know");
        arr.add(3, "but if you listen");
        arr.add(4, "you may learn something new");

        System.out.println(arr.size());
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
