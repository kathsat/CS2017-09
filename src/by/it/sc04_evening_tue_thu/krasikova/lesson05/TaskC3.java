package by.it.sc04_evening_tue_thu.krasikova.lesson05;

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
    public static void main (String args []) {
        for (int e=1; e<=10; e++) {
                String x=new String ("два");
                switch (e) {
                    case 1:
                        String y=("два");
                        String z= ("четыре");
                        System.out.println(x+" умножить на "+y+" равно "+z);
                        break;
                    case 2:
                        String a=("три");
                        String b=("шесть");
                        System.out.println(x+" умножить на "+a+" равно "+b);
                        break;
                    case 3:
                        String c=("четыре");
                        String d= ("восемь");
                        System.out.println(x+" умножить на "+c+" равно "+d);
                        break;
                    case 4:
                        String g=("пять");
                        String f= ("десять");
                        System.out.println(x+" умножить на "+g+" равно "+f);
                        break;
                    case 5:
                        String k=("шесть");
                        String l= ("двенадцать");
                        System.out.println(x+" умножить на "+k+" равно "+l);
                        break;
                    case 6:
                        String m=("семь");
                        String n= ("четырнадцать");
                        System.out.println(x+" умножить на "+m+" равно "+n);
                        break;
                    case 7:
                        String o=("восемь");
                        String p= ("шестнадцать");
                        System.out.println(x+" умножить на "+o+" равно "+p);
                        break;
                    case 8:
                        String r=("девять");
                        String s= ("восемнадцать");
                        System.out.println(x+" умножить на "+r+" равно "+s);
                        break;
                    case 9:
                        String t=("десять");
                        String u= ("двадцать");
                        System.out.println(x+" умножить на "+t+" равно "+u);
                        break;
                }

            }
        for (int e=1; e<=10; e++) {
            String x= ("три");
            switch (e) {
                case 1:
                    String y=("два");
                    String z= ("шесть");
                    System.out.println(x+" умножить на "+y+" равно "+z);
                    break;
                case 2:
                    String a=("три");
                    String b=("шесть");
                    System.out.println(x+" умножить на "+a+" равно "+b);
                    break;
                case 3:
                    String c=("три");
                    String d= ("девять");
                    System.out.println(x+" умножить на "+c+" равно "+d);
                    break;
                case 4:
                    String g=("четыре");
                    String f= ("двенадцать");
                    System.out.println(x+" умножить на "+g+" равно "+f);
                    break;
                case 5:
                    String k=("пять");
                    String l= ("пятнадцать");
                    System.out.println(x+" умножить на "+k+" равно "+l);
                    break;
                case 6:
                    String m=("шесть");
                    String n= ("восемнадцать");
                    System.out.println(x+" умножить на "+m+" равно "+n);
                    break;
                case 7:
                    String o=("семь");
                    String p= ("двадцать один");
                    System.out.println(x+" умножить на "+o+" равно "+p);
                    break;
                case 8:
                    String r=("восемь");
                    String s= ("двадцать четыре");
                    System.out.println(x+" умножить на "+r+" равно "+s);
                    break;
                case 9:
                    String t=("девять");
                    String u= ("двадцать семь");
                    System.out.println(x+" умножить на "+t+" равно "+u);
                    break;
            }

        }
    }

}
