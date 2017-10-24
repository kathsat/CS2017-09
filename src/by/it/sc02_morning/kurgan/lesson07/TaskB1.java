package by.it.sc02_morning.kurgan.lesson07;
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
        ArrayList <String> str = new ArrayList<>();
        str.add ("Hi1");
        str.add ("Hi2");
        str.add ("Hi3");
        str.add ("Hi4");
        str.add ("Hi5");
        System.out.println (str.size());

        for (int i =0; i<5; i++)
            System.out.println(str.get(i));
    }

}
