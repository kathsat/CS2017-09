package by.it.sc04_evening_tue_thu.rumiantsau.lesson05;

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
        for (int i = 2; i <= 10; i ++) {
            for (int j = 2; j <= 10; j++) {
                System.out.println(GetMultString(i, j));
            }
        }
    }

    private static String GetMultString(int factor1, int factor2) {
        int mult = factor1 * factor2;
        return GetMultiplierString(factor1) + " умножить на " + GetMultiplierString(factor2) + " равно " + GetMultiplierString(mult) + " ";
    }

    private static String GetMultiplierString(int factor) {
        switch (factor) {
            case 10 : return "десять";
            case 11 : return "одинадцать";
            case 12 : return "двенадцать";
            case 13 : return "тринадцать";
            case 14 : return "четырнадцать";
            case 15 : return "пятнадцать";
            case 16 : return "шестнадцать";
            case 17 : return "семнадцать";
            case 18 : return "восемнадцать";
            case 19 : return "девятнадцать";
            default : {
                String HO = GetHighOrder(factor);
                String LO = GetLowOrder(factor);

                if ((HO.length() > 0) && (LO.length() > 0))
                    return HO + " " + LO;
                else if ((HO.length() > 0) && (LO.length() == 0))
                    return HO;
                else if ((HO.length() == 0) && (LO.length() > 0))
                    return LO;
                else
                    return "";
            }
        }
    }

    private static String GetHighOrder(int factor) {
        int i = (int) (factor / 10);

        switch (i) {
            case 2  : return "двадцать";
            case 3  : return "тридцать";
            case 4  : return "сорок";
            case 5  : return "пятьдесят";
            case 6  : return "шестьдесят";
            case 7  : return "семьдесят";
            case 8  : return "восемьдесят";
            case 9  : return "девяносто";
            case 10 : return "сто";
            default : return "";
        }
    }

    private static String GetLowOrder(int factor) {
        int i = factor % 10;

        switch (i) {
            case 1  : return "один";
            case 2  : return "два";
            case 3  : return "три";
            case 4  : return "четыре";
            case 5  : return "пять";
            case 6  : return "шесть";
            case 7  : return "семь";
            case 8  : return "восемь";
            case 9  : return "девять";
            default : return "";
        }
    }
}
