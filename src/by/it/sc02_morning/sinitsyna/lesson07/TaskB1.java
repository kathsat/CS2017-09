package by.it.sc02_morning.sinitsyna.lesson07;
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
        ArrayList<String> atr = new ArrayList<>();
        atr.add("H11");
        atr.add("H12");
        atr.add("H13");
        atr.add("H14");
        atr.add("H15");
        System.out.println(atr.size());
        for (int i = 0; i < atr.size(); i++) {
            System.out.println(atr.get(i));
        }
    }
}
