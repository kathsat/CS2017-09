package by.it.sc02_morning.lutskevichm.lesson05;

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

import java.util.Stack;

public class TaskC3 {
       public static void main(String[] args) {
        int i;
         for (i=1; i<=10; i++){
            int j=1;
            while (j <= 10){
                System.out.println(NumToText(i)+" умножить на " +NumToText(j)+ " равно "+ NumToText(i*j)+" ");
                j++;
            }
         }
    }

    private static String NumToText(int a) {
        String d = "";
        if (a == 100) {
            return "сто";
        }

        if (a < 10) {
            switch (a) {
                case 1:
                    return "один";
                case 2:
                    return "два";
                case 3:
                    return "три";
                case 4:
                    return "четыре";
                case 5:
                    return "пять";
                case 6:
                    return "шесть";
                case 7:
                    return "семь";
                case 8:
                    return "восемь";
                case 9:
                    return "девять";
            }
        }

        if ((a < 20) && (a >= 10)) {
            switch (a % 10) {
                case 0:
                   return "десять";
                case 1:
                    return "одиннадцать";
                case 2:
                    return "двенадцать";
                case 3:
                    return "тринадцать";
                case 4:
                    return "четырнадцать";
                case 5:
                    return "пятнадцать";
                case 6:
                    return "шестнадцать";
                case 7:
                    return "семнадцать";
                case 8:
                    return "восемнадцать";
                case 9:
                    return "девятнадцать";
            }
        } else {
            switch (a / 10) {

                case 2:
                    d = "двадцать";
                    break;
                case 3:
                    d = "тридцать";
                    break;
                case 4:
                    d = "сорок";
                    break;
                case 5:
                    d = "пятьдесят";
                    break;
                case 6:
                    d = "шестьдесят";
                    break;
                case 7:
                    d = "семьдесят";
                    break;
                case 8:
                    d = "восемьдесят";
                    break;
                case 9:
                    d = "девяносто";
                    break;
            }
        }

            if (a%10 != 0) {
                return d + " " + NumToText((a % 10));
            }
            else {
            return d;
            }



    }


}
