package by.it.sc04_evening_tue_thu.gimzhevsky.lesson07;
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
        ArrayList list = new ArrayList();
        list.add("Строка 1");
        list.add("Строка 2");
        list.add("Строка 3");
        list.add("Строка 4");
        list.add("Строка 5");
        System.out.println(list.size());
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
