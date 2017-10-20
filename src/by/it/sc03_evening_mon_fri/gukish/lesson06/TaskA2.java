package by.it.sc03_evening_mon_fri.gukish.lesson06;
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

 */
import static java.lang.System.in;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskA2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

            for (int i = 0; i <a ; i++)
            {
                for (int j = 0; j < b; j++) {
                    System.out.print("$ ");
                }
                System.out.println();
            }
        }
    }


