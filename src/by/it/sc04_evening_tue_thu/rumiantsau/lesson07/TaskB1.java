package by.it.sc04_evening_tue_thu.rumiantsau.lesson07;
/*
Создайте 5 различных строчек в списке
1. Создайте список строк.
2. Добавьте в него 5 различных строчек.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();

        for (Integer i = 1; i <= 5; i++){
            list.add("String_".concat(i.toString()));
        }

        System.out.println(list.size());
        for (String str : list) {
            System.out.println(str);
        }
    }
}
