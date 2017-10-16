package by.it.sc03_evening_mon_fri.mironchik.lesson06;
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
            int s = 0;
            int a=0;                Scanner sc = new Scanner(System.in);

        while (a != -1) {
                a = sc.nextInt();
                s += a;
            }
            System.out.println(s);
    }
}
//второй вариант
/*public class TaskB1 {
    public static void main(String[] args) {
        System.out.println("Сколько чисел вы хотите ввести? ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s=0, b=-1;
        int [] ar=new int[a];
        for (int i=0;i<a;i++) {
            ar[i]=sc.nextInt();
            s+=ar[i];
            if(ar[i]==-1) break;
        }
        System.out.println("Сумма чисел = "+s);
    }
}*/
