package by.it.sc02_morning.striga.lesson06;
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

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        char doll='$';
        int size=10;
        int i=1;

        for (i=1; i<=size; i++){

            int j=1;
            while (j <= size){
                System.out.print(doll+" ");
                j++;
            }
            System.out.println();
        }
    }
}
