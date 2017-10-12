package by.it.sc04_evening_tue_thu.krasikova.lesson06;
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
    public static void main (String args[]) {
        char buck='$';
        int hor=1;
        int vert=1;
        while (vert<11) {
            if (hor<=10) {
                System.out.print(buck+" "+buck+" "+buck+" "+buck+" "+buck+" "+buck+" "+buck+" "+buck+" "+buck+" "+buck+" ");
                hor++;
            }
            System.out.println();
            vert++;
        }

    }

}
