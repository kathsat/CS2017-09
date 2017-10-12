package by.it.sc04_evening_tue_thu.Tovstik.lesson05;
/*
Существует ли пара?
Ввести с клавиатуры три целых числа.
Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если два числа равны между собой, необходимо вывести числа на экран.
4. Если все три числа равны между собой, необходимо вывести все три.
5. Если нет равных чисел, ничего не выводить.

Пример для чисел 1 2 2:
2 2

Пример для чисел 2 2 2:
2 2 2

 */


import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean allEqual = false;
        boolean pair1 = false;
        boolean pair2 = false;
        boolean pair3 = false;

        if ((a == b) && (a == c))

            allEqual = true;
        else {
            if ((a == b) && (a != c)) pair1 = true;
            if ((a == c) && (a != b)) pair2 = true;
            if ((b == c) && (a != b)) pair3 = true;
        }

        if (allEqual)
            System.out.println(a + " " + b + " " + c);
        else if (pair1)
            System.out.println(a + " " + b);
        else if (pair2)
            System.out.println(a + " " + c);
        else if (pair3)
            System.out.println(b + " " + c);


    }

}
