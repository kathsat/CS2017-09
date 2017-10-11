package by.it.sc04_evening_tue_thu.rumiantsau.lesson05;
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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        boolean allEqual = false;
        boolean pair1 = false;
        boolean pair2 = false;
        boolean pair3 = false;

        if ((x == y) && (x == z))
            allEqual = true;
        else {
            if ((x == y) && (x != z)) pair1 = true;
            if ((x == z) && (x != y)) pair2 = true;
            if ((y == z) && (x != y)) pair3 = true;
        }

        if (allEqual)
            System.out.println(x + " " + y + " " + z);
        else if (pair1)
            System.out.println(x + " " + y);
        else if (pair2)
            System.out.println(x + " " + z);
        else if (pair3)
            System.out.println(y + " " + z);
    }
}
