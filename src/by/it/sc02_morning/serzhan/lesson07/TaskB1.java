package by.it.sc02_morning.serzhan.lesson07;
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
        ArrayList<String> str=new ArrayList<>();
        str.add("ff1");
        str.add("ff2");
        str.add("ff3");
        str.add("ff4");
        str.add("ff5");
        System.out.println(str.size());
        for(int i=0;i<str.size();i++){
            System.out.println(str.get(i));
        }
        //for(String value:str) for each цикл
          //  System.out.println(value);
    }

}
