package by.it.sc03_evening_mon_fri.kalita.lesson07;
/*
Создайте 5 различных строчек в списке
1. Создайте список строк.
2. Добавьте в него 5 различных строчек.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) throws IOException {
        List str=new ArrayList<String>();
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Scanner reader = new Scanner(System.in);
        String[]strin=new String[5];
        strin[0]="jkdlvnv";
        strin[1]="kdvjkbdvkjdbvjkdbvkj";
        strin[2]="vbdjklvbdkjvbdjklvbdkjvbdvk";
        strin[3]="vbjdk";
        strin[4]="ndbvjdbvkdbvvbjdz";
        for (int i = 0;i<5;i++) {
            str.add(strin[i]);
        }
        System.out.println(str.size());
        for (int i=0;i<5;i++){
            System.out.println(str.get(i));
    }

    }

}
