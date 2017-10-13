package by.it.sc02_morning.davydov.lesson06;
/*
Рисуем долларовый прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник высотой m и шириной n из знаков $.

Пример: m=2, n=4
$$$$
$$$$

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить прямоугольник размером m на n из знаков $.
4. В программе должен использоваться цикл for.
//
// */
//
import java.util.Scanner;

public class TaskA2 {

    public static void main(String[] args) {

        Scanner scccc = new Scanner(System.in);
        int m = scccc.nextInt();
        int n = scccc.nextInt();
        int n0 = 1;
        int m0 = 1;


        for (int i = 1; i <= (m*n) ; i++) {

            if (n0 < n) {
                System.out.print("$");
                n0++;
            }
            else {
                System.out.println("$");
                n0 = 1;
            }



        }







    }





}