package by.it.sc02_morning.davydov.lesson07;
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

        ArrayList<String> listt = new ArrayList<String>();
        listt.add("Hello! ");
        listt.add("My ");
        listt.add("name ");
        listt.add("is ");
        listt.add("Hello!!!");
        System.out.println(listt.size());



        for (int i = 0; i < listt.size(); i++) {
            System.out.println(listt.get(i));

        }


    }
}
