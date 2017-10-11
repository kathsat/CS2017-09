package by.it.sc04_evening_tue_thu.bayramova.lesson05;

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
    public static String ExceptionalNumberToWord(int n){
        switch(n){
            case 0:
                return "";
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
            case 12:
                return "двенадцать";
            case 14:
                return "четырнадцать";
            case 15:
                return "пятнадцать";
            case 16:
                return "шестнадцать";
            case 18:
                return "восемнадцать";
            case 90:
                return "девяносто";
            case 100:
                return "сто";
            default:
                return "error";
        }
    }
    public static String NumberToWord(int n){
        if(isExceptional(n)){
            return ExceptionalNumberToWord(n);
        }
        String ones="";
        String tens="";
        switch(n-n%10){
            case 20:
                tens = "двадцать";
                break;
            case 30:
                tens = "тридцать";
                break;
            case 40:
                tens = "сорок";
                break;
            case 50:
                tens = "пятьдесят";
                break;
            case 60:
                tens = "шестьдесят";
                break;
            case 70:
                tens = "семьдесят";
                break;
            case 80:
                tens = "восемьдесят";
                break;
        }
        if(n%10==0){
            return tens+" ";
        }
        else {
            ones = ExceptionalNumberToWord(n % 10);
            return tens + " " + ones;
        }
    }
    public static boolean isExceptional(int n){
        switch(n){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 16:
            case 18:
            case 90:
            case 100:
                return true;
            default:
                return false;

        }
    }
    public static void main(String[] args){
        for(int i=2;i<11;++i){
            for(int j=2;j<11;++j){
                System.out.println(ExceptionalNumberToWord(i)+" умножить на "+ExceptionalNumberToWord(j)+" равно "+NumberToWord(i*j)+" ");
            }
        }
    }

}
