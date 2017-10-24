package by.it.sc04_evening_tue_thu.bukhtik.lesson06;
/*
Суммирование
Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
-1 должно тоже учитываться в сумме.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна посчитать сумму введенных чисел.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
4. В программе должен использоваться цикл for или цикл while.
        */

import java.util.Scanner;

public class TaskB1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int sum = 0;

        while (true) {
            i = sc.nextInt();
            System.out.println(i);
            sum += i;
            if (i == -1) break;
        }

        System.out.print(sum);

        }

    }



