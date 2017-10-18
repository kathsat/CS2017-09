package by.it.sc04_evening_tue_thu.runec.lesson07;
/*
Создайте 5 различных строчек в списке
1. Создайте список строк.
2. Добавьте в него 5 различных строчек.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.
*/


import java.util.ArrayList;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        arr.add("Толпа глухая,");
        arr.add("Крылатой новизны любовница слепая,");
        arr.add("Надменных баловней меняет каждый день,");
        arr.add("И катятся стуча с ступени на ступень");
        arr.add("Кумиры их, вчера увенчанные ею.");
        System.out.println(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
//
        }
    }

}
