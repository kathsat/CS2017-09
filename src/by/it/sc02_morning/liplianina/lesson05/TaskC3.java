package by.it.sc02_morning.liplianina.lesson05;

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



public class TaskC3 {
    public static void main(String[] args) {
        int size = 10;
        int i = 0, j = 0;
        String e = "";
        String ed = "";
        String d = "";
        String res = "";

        while (i <= size) {
            i++;
            while (j <= size) {
                j++;
                int m = i * j;
                if ((m / 10) < 1) {
                    switch (m) {
                        case 1:
                            e = "один";
                            break;
                        case 2:
                            e = "два";
                            break;
                        case 3:
                            e = "три";
                            break;
                        case 4:
                            e = "четыре";
                            break;
                        case 5:
                            e = "пять";
                            break;
                        case 6:
                            e = "шесть";
                            break;
                        case 7:
                            e = "семь";
                            break;
                        case 8:
                            e = "восемь";
                            break;
                        case 9:
                            e = "девять";
                            break;

                    }
                } else if ((m / 10) < 2 && (m / 10) >= 1) {
                    switch (m) {
                        case 1:
                            ed = "десять";
                            break;
                        case 2:
                            ed = "одиннадцать";
                            break;
                        case 3:
                            ed = "двенадцать";
                            break;
                        case 4:
                            ed = "тринадцать";
                            break;
                        case 5:
                            ed = "четырнадцать";
                            break;
                        case 6:
                            ed = "пятнадцать";
                            break;
                        case 7:
                            ed = "шестнадцать";
                            break;
                        case 8:
                            ed = "семнадцать";
                            break;
                        case 9:
                            ed = "восемнадцать";
                            break;
                        case 10:
                            ed = "девятнадцать";
                            break;
                    }

                } else if (m % 10 == 0 && m != 10) {
                    switch (m) {
                        case 1:
                            d = "двадцать";
                            break;
                        case 2:
                            d = "тридцать";
                            break;
                        case 3:
                            d = "сорок";
                            break;
                        case 4:
                            d = "пятьдесят";
                            break;
                        case 5:
                            d = "шестьдесят";
                            break;
                        case 6:
                            d = "семьдесят";
                            break;
                        case 7:
                            d = "восемьдесят";
                            break;
                        case 8:
                            d = "девяносто";
                            break;
                        case 9:
                            d = "сто";
                            break;
                    }
                }
                if (e.length() > 0) res = e;
                else if (ed.length() > 0) res = ed;
                else if (d.length() > 0) res = d + " " + e;

                System.out.print(i + " умножить на " + j + " равно " + res);

                e = "";
                ed = "";
                d = "";

                System.out.println();
            } j = 0;
        }
    }
}


