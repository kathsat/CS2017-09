package by.it.sc03_evening_mon_fri.mironchik.lesson05;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

import java.util.Scanner;

public class TaskC3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int i;
        int j;
        for (i=2;i<=size;i++) {

            for(j=2;j<=size;j++) {
                System.out.print(" умножить на ");
                switch (j) {
                    case 2:
                        System.out.print("два");
                        break;
                    case 3:
                        System.out.print("три");
                        break;
                    case 4:
                        System.out.print("четыре");
                        break;
                    case 5:
                        System.out.print("пять");
                        break;
                    case 6:
                        System.out.print("шесть");
                        break;
                    case 7:
                        System.out.print("семь");
                        break;
                    case 8:
                        System.out.print("восемь");
                        break;
                    case 9:
                        System.out.print("девять");
                        break;
                    case 10:
                        System.out.print("десять");
                        break;
                }

                System.out.println(" равно "+i*j);
            }
        }
    }

}
