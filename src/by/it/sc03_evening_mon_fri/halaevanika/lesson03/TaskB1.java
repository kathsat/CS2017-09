package by.it.sc03_evening_mon_fri.halaevanika.lesson03;

/*
Выводим квадрат числа
Напишите программу, которая считывает с клавиатуры целое число a и выводит квадрат этого числа (a * a).
Для считывания данных с клавиатуры используйте метод nextInt() объекта класса Scanner.
Создать Scanner можно так:
Scanner sc=new Scanner(System.in);

Требования:
1. Программа должна выводить текст.
2. В программе необходимо создать объект типа Scanner.
3. Программа должна считывать число типа Int с клавиатуры.
4. Программа должна выводить квадрат считанного числа.
 */

class TaskB1 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("ВВедите число:");
    int a = sc.nextInt();
    int b = a * a;
    System.out.println("Квадрат считанного числа:" + b);
}
}
