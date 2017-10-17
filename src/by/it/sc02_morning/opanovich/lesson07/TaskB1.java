package by.it.sc02_morning.opanovich.lesson07;
/*
Создайте 5 различных строчек в списке
1. Создайте список строк.
2. Добавьте в него 5 различных строчек.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskB1 {

    public static void main(String[] args) {

        List<String> array = new ArrayList<>();
        Collections.addAll(array, "one", "two", "three", "four", "five");
        System.out.println(array.size());
        for (String line : array) {
            System.out.println(line);
        }
    }
}
