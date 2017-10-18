package by.it.sc02_morning.menchytsky.lesson07;
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
        ArrayList<String> arr = new ArrayList<>();
        for(int i=1; i<=5; i++){
            String str="a";
            str=str+i;
            arr.add(str);
        }
        System.out.println(arr.size());
        for (String anArr : arr) {
            System.out.println(anArr);
        }
    }

}
