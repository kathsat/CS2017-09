package by.it.sc04_evening_tue_thu.bukhtik.lesson06;
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

        /*String s= "$$$$$$$$$$";
        int count = 0;

        while (count <10){

            count++;
            System.out.println(s);
        }
*/
        int i = 0;
        int j = 0;
        while (i< 10 && j<10){
            System.out.print('$'+ " ");
            i++;
            if (i==10) {
                System.out.println();
                j++;
                i=0;
            }
        }
    }



}
