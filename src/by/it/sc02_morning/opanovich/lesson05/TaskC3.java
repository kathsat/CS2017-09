package by.it.sc02_morning.opanovich.lesson05;

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

        for (int i = 2; i <= 10; i++) {
            for (int j = 2; j <= 10; j++) {
                System.out.printf("%s умножить на %s равно %s \n", toWord(i), toWord(j), toWord(i * j));
            }
        }
    }

    private static String toWord(int i) {
        String answer = "";

        if (i == 100) {
            return "сто";
        }

        if (i < 20) {
            switch (i) {
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
                case 10:
                    return "десять";
                case 11:
                    return "одиннадцать";
                case 12:
                    return "двенадцать";
                case 13:
                    return "тринадцать";
                case 14:
                    return "четырнадцать";
                case 15:
                    return "пятнадцать";
                case 16:
                    return "шестнадцать";
                case 17:
                    return "семнадцать";
                case 18:
                    return "восемнадцать";
                case 19:
                    return "девятнадцать";
            }
        } else {
            switch(i / 10) {
                case 2:
                    answer = "двадцать";
                    break;
                case 3:
                    answer = "тридцать";
                    break;
                case 4:
                    answer = "сорок";
                    break;
                case 5:
                    answer = "пятьдесят";
                    break;
                case 6:
                    answer = "шестьдесят";
                    break;
                case 7:
                    answer = "семьдесят";
                    break;
                case 8:
                    answer = "восемьдесят";
                    break;
                case 9:
                    answer = "девяносто";
                    break;
            }
        }
        if (i % 10 != 0) {
            return answer + " " + toWord(i % 10);
        } else {
            return answer;
        }
    }
}
