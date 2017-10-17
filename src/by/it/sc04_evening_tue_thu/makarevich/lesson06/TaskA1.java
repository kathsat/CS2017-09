package by.it.sc04_evening_tue_thu.makarevich.lesson06;
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

import by.it.examples.lesson06.While;

public class TaskA1 {
    public static void main(String[] args) {
        String s = "$ $ $ $ $ $ $ $ $ $";
        int i=1;
        while (i<=10){
            System.out.print(s+" ");
                    i++;
                    System.out.println(); }
    }
}
