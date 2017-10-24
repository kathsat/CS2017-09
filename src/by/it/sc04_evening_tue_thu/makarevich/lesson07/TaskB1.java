package by.it.sc04_evening_tue_thu.makarevich.lesson07;
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
        ArrayList<String> spisok = new ArrayList<>();
        spisok.add(0,"Наша");
        spisok.add(1,"Таня");
        spisok.add(2,"громко");
        spisok.add(3,"плачет");
        spisok.add(4,"уронила");
        System.out.println(spisok.size());
        for (String s : spisok) {
            System.out.println(s);
        }
    }
}
