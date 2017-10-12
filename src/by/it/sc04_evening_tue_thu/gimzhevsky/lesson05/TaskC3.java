package by.it.sc04_evening_tue_thu.gimzhevsky.lesson05;

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
        int result;
        String s1;
        String s2;
        String s3;
        for (int i = 1; i<=10; i++){
            for (int j = 1; j<=10; j++){
                s1 = toText(i);
                s2 = toText (j);
                s3 = toText(i*j);
                System.out.println(s1 + "умножить на " + s2 + "равно " + s3);
            }
        }
    }

    private static String toText(int i) {
        String s = "";
        if (i == 100) s="сто ";
        else if(i<100 && i >9) {
            switch (i / 10) {
                case 9:
                    s = "девяносто ";
                    break;
                case 8:
                    s = "восемьдесят ";
                    break;
                case 7:
                    s = "семьдесят ";
                    break;
                case 6:
                    s = "шестьдесят ";
                    break;
                case 5:
                    s = "пятьдесят ";
                    break;
                case 4:
                    s = "сорок ";
                    break;
                case 3:
                    s = "тридцать ";
                    break;
                case 2:
                    s = "двадцать ";
                    break;
                case 1:
                    switch (i % 10) {
                        case 9:
                            s = "девятнадцать ";
                            break;
                        case 8:
                            s = "восемнадцать ";
                            break;
                        case 7:
                            s = "семнадцать ";
                            break;
                        case 6:
                            s = "шестнадцать ";
                            break;
                        case 5:
                            s = "пятнадцать ";
                            break;
                        case 4:
                            s = "четырнадцать ";
                            break;
                        case 3:
                            s = "тринадцать ";
                            break;
                        case 2:
                            s = "двенадцать ";
                            break;
                        case 1:
                            s = "одинадцать ";
                            break;
                        case 0:
                            s = "десять ";
                            break;
                    }
            }
        }
            if (i<10 || i>20){
                switch (i%10) {
                    case 9:
                        s = s +"девять ";
                        break;
                    case 8:
                        s = s +"восемь ";
                        break;
                    case 7:
                        s = s +"семь ";
                        break;
                    case 6:
                        s = s +"шесть ";
                        break;
                    case 5:
                        s = s +"пять ";
                        break;
                    case 4:
                        s = s +"четыре ";
                        break;
                    case 3:
                        s = s +"три ";
                        break;
                    case 2:
                        s = s +"два ";
                        break;
                    case 1:
                        s = s +"один ";
                        break;
                }
        }
        return s;
    }
}
