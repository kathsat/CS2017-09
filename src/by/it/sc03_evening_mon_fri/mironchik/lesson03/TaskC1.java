package by.it.sc03_evening_mon_fri.mironchik.lesson03;


/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
import java.util.Scanner;
class TaskC1 {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        int res=a+b;
        System.out.println("Sum = " + res);
    }

}
