package by.it.sc02_morning.safronov.lesson07;
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
        ArrayList<String> str = new ArrayList<>();
        str.add("Hi1");
        str.add("Hi2");
        str.add("Hi3");
        str.add("Hi4");
        str.add("Hi5");
        System.out.println(str.size());
        for (String value : str) {
            System.out.println(value);
        }
    }
}

//        ArrayList<String> arrs = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        for(int i=0;i<5;i++){
//            String line=sc.next();
//            arrs.add(line);
//        }
//        System.out.println(arrs.size());
////        1 вар
////        for(String value:arrs)
////            System.out.println(value);
////        2 вар
//        for(int i=0;i<arrs.size();i++){
//            System.out.println(arrs.get(i));
//        }
//    }
//
//}