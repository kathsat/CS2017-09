package by.it.sc02_morning.patsko.lesson07;
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
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Hi1");
        arr.add("Hi2");
        arr.add("Hi3");
        arr.add("Hi4");
        arr.add("Hi5");
        System.out.println(arr.size());
        for (String tmp: arr) {
            System.out.println(tmp);
        }
    }
}
