package by.it.sc02_morning.golikov.lesson07;
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
        ArrayList<String> str = new ArrayList<>();
        str.add("Hello");
        str.add("Привет");
        str.add("Hao");
        str.add("Aloha");
        str.add("Opa");

        System.out.println(str.size());
//for (String value:str)
//    System.out.println(value);
        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }
    }
}
