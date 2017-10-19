package by.it.sc04_evening_tue_thu.sorokina.lesson07;
/*
Создайте 5 различных строчек в списке
1. Создайте список строк.
2. Добавьте в него 5 различных строчек.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.
*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main( String[] args ) {
        ArrayList<String> lines = new ArrayList<>();
        lines.add(0,"Мороз и солнце; день чудесный!");
        lines.add(1,"Еще ты дремлешь, друг прелестный –");
        lines.add(2,"Пора, красавица, проснись");
        lines.add(3,"Открой сомкнуты негой взоры");
        lines.add(4,"Навстречу северной Авроры,");

        System.out.println(lines.size());
        for (String line : lines) {
            System.out.println(line);

        }

    }

}
