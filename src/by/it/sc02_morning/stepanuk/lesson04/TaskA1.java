package by.it.sc02_morning.stepanuk.lesson04;

/*
Lesson 04. Task A1. Калькулятор.
Напишите программу, которая считывает с клавиатуры два целых числа a и b
после этого выводит через пробел:

сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (результат выводится как тип int).

после этого еще раз выводит через пробел
сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (но результат выводится как тип double).

Для считывания данных с клавиатуры используйте метод nextInt() объекта класса Scanner.
Создать Scanner можно так:
Scanner sc=new Scanner(System.in);

Требования:
1. В программе необходимо создать объект типа Scanner.
2. Программа должна считывать два числа типа int с клавиатуры.
3. Программа должна дважды выводить в строку пять чисел через пробел.
4. Программа должна выводить int сумму, разность, произведение, частное и отстаток от деления этих чисел двух чисел.
4. Программа должна выводить double сумму, разность, произведение, частное и отстаток от деления этих чисел двух чисел.

Пример:

Ввод:
7 2
Вывод:
9 5 14 3 1
9.0 5.0 14.0 3.5 1.0

 */

import java.util.Scanner;

class TaskA1 {
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a + " " + b);

        int sum = a + b;
        int raz = a - b;
        int mult = a * b;
        int div = a / b;
        int remn = a % b;
        System.out.println(sum + " " + raz + " " + mult + " " + div + " " + remn);

        double da = (double)a;
        double db = (double)b;

        double dsum = da + db;
        double draz = da - db;
        double dmult = da * db;
        double ddiv = da / db;
        double dremn = da % db;
        System.out.println(dsum + " " + draz + " " + dmult + " " + ddiv + " " + dremn);

    }

}
