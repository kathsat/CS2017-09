package by.it.sc02_morning.kurgan.lesson06;
/*
Вывести на экран квадрат из 10х10 символов $.
После каждого символа нужно ставить пробел.
Нужно использовать всего ОДИН цикл while.
Разрешается использовать также опреатор if.
Буквы в каждой строке не разделять.

Пример вывода на экран:
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $

*/

public class TaskA1 {
    public static void main (String[] args) {
//        String str = "& & & & & & & & & &";
//        int i = 1;
//        while (i <=10){
//            System.out.println(str);
//            i++;
//        }
//        String s = "$";
//        int a = 0;
//        while (a < 100) {
//            System.out.print(s + " ");
//            a++;
//            if (a == 10 || a == 20 || a == 30 || a == 40 || a == 50 || a == 60 || a == 70 || a == 80 || a == 90 || a == 100) {
//                System.out.println();
//            }
//        }
        int x = 0;
        while(x < 100){
            System.out.print("$ ");
            x++;
            if(x % 10 == 0)
                System.out.println();
            }

    }

}
