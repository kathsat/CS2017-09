package by.it.sc02_morning.patsko.lesson05;

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
    static void zamena(int chislo){
        if(chislo==100) System.out.println("сто ");
        else {
            int x = chislo / 10;    int y = chislo % 10;
            switch (x) {
                case 0: break;
                case 1: if (y == 0)     System.out.print("десять ");
                else {
                    switch(y) {
                        case 1:System.out.print("одинадцать ");break;
                        case 2:System.out.print("двенадцать ");break;
                        case 3:System.out.print("тринадцать ");break;
                        case 4:System.out.print("четырнадцать ");break;
                        case 5:System.out.print("пятнадцать ");break;
                        case 6:System.out.print("шестнадцать ");break;
                        case 7:System.out.print("семьнадцать ");break;
                        case 8:System.out.print("восемнадцать ");break;
                        case 9:System.out.print("девятнадцать ");break;
                    }
                }
                    break;
                case 2:System.out.print("двадцать ");break;
                case 3:System.out.print("тридцать ");break;
                case 4:System.out.print("сорок ");break;
                case 5:System.out.print("пятьдесят ");break;
                case 6:System.out.print("шестьдесят ");break;
                case 7:System.out.print("семьдесят ");break;
                case 8:System.out.print("восемьдесят ");break;
                case 9:System.out.print("девяносто ");break;
            }
            if(x!=1) {
                switch (y) {
                    case 0:break;
                    case 1:System.out.print("один ");break;
                    case 2:System.out.print("два ");break;
                    case 3:System.out.print("три ");break;
                    case 4:System.out.print("четыре ");break;
                    case 5:System.out.print("пять ");break;
                    case 6:System.out.print("шесть ");break;
                    case 7:System.out.print("семь ");break;
                    case 8:System.out.print("восемь ");break;
                    case 9:System.out.print("девять ");break;
                }
            }
        }
    }
    public static void main(String[] args) {
        for(int i=1;i<=10;i++) {
            for(int j=1;j<=10;j++){
                zamena(i); System.out.print("умножить на "); zamena(j);System.out.print("равно "); zamena(i*j);
                System.out.println();
            }
        }
    }
}
