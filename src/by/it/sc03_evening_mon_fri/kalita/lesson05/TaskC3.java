package by.it.sc03_evening_mon_fri.kalita.lesson05;

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

import java.util.Locale;
import java.util.Scanner;

public class TaskC3 {
    //TaskC3 c3  = new TaskC3();

    public String numToStr(int num){
        if(num>10&&num<20)return tenths(num%10);
        if((num>=20||num==10)&&num<100)return hungredth(num/10%10)+decade(num%10);
        if(num<10)return decade(num);
        if(num>=100)return "сто ";
        return "0";
    }
    public String hungredth(int num) {
        switch (num) {
            case 1:
                return "десять ";
            case 2:
                return "двадцать ";
            case 3:
                return "тридцать ";
            case 4:
                return "сорок ";
            case 5:
                return "пятьдесят ";
            case 6:
                return "шестьдесят ";
            case 7:
                return "семьдесят ";
            case 8:
                return "восемьдесят ";
            case 9:
                return "девяносто ";
            default:
                return "";
        }
    }
       public String decade(int num) {
           switch (num) {
               case 1:
                   return "один ";
               case 2:
                   return "два ";
               case 3:
                   return "три ";
               case 4:
                   return "четыре ";
               case 5:
                   return "пять ";
               case 6:
                   return "шесть ";
               case 7:
                   return "семь ";
               case 8:
                   return "восемь ";
               case 9:
                   return "девять ";
               default:
                   return "";
           }
       }
       public String tenths(int num){
           switch (num) {
               case 1:
                   return "одинадцать ";
               case 2:
                   return "двенадцать ";
               case 3:
                   return "тринадцать ";
               case 4:
                   return "четырнадцать ";
               case 5:
                   return "пятнадцать ";
               case 6:
                   return "шестнадцать ";
               case 7:
                   return "семнадцать ";
               case 8:
                   return "восемнадцать ";
               case 9:
                   return "девятнадцать ";
               default:
                   return "";
           }
       }

    public static void main(String[] args) {
           TaskC3 c3=new TaskC3();
           int size=10;// = new Scanner(System.in).nextInt();
        for (int i = 1; i < size; i++) {
            for (int j = 1; j < size; j++) {
                System.out.println(c3.numToStr(i+1)+"умножить на " +c3.numToStr(j+1)+"равно " +c3.numToStr((i+1)*(1+j)));
            }
        }
    }
}
