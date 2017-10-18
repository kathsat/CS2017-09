package by.it.sc04_evening_tue_thu.bayramova.lesson07;
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
        ArrayList<String>a=new ArrayList<>();
        a.add("I'm the one, Don't weigh  a ton");
        a.add("Don't need a gun to get respect up on the street");
        a.add("Under the sun");
        a.add("The bastard son");
        a.add("Will pop the glock to feet himself and family.");
        System.out.println(a.size());
        for (int i=0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
    }

}
