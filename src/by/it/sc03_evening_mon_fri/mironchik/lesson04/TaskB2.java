package by.it.sc03_evening_mon_fri.mironchik.lesson04;

/*
Lesson 04. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
import java.util.Scanner;
class TaskB2 {
    private static double dis(int a,int b, int c) {
        double d=b*b-4*a*c;
        return d;
    }
    public static void main(String[] args) {
        System.out.println("Введите 3 числа: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        double res=dis(a,b,c);
        if (res<0) {
            System.out.println("Отрицательный дискриминант");
        }
        else {
            double x1=(-b+Math.sqrt(res))/(2*a);
            double x2=(-b-Math.sqrt(res))/(2*a);
            if(res>0) System.out.println(x1+" "+x2);
            if(res==0) System.out.println(x1);
        }

    }
}
