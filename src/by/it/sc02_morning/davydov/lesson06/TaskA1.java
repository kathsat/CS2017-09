package by.it.sc02_morning.davydov.lesson06;
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
    public static void main(String[] args) {
        int max_l = 10;
        int cur_l = 1;
        int cur_h = 1;
        int max_h = 10;

        while (cur_h <= max_h) {

            if (cur_l < max_l) {
                System.out.print("$ ");
                cur_l++;
            } else {
                System.out.println("$ ");
                cur_h++;
                cur_l = 1;
            }

        }

    }


}
