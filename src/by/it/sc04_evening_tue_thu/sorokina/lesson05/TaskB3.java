package by.it.sc04_evening_tue_thu.sorokina.lesson05;
/*
С клавиатуры вводится некоторое число.
Пусть считается сумма int sum=1+2+3+4+5+... и т.д.
Каждая цифра суммы выводится в консоль через запятую (без пробела).
Остановите вывод до того, как сумма превысит введенное число.

Например:
Ввод:
122
Вывод:
1,3,6,10,15,21,28,36,45,55,66,78,91,105,120,

Ввод:
15
Вывод:
1,3,6,10,15,

Ввод:
14
Вывод:
1,3,6,10,


 */


import java.util.Scanner;

public class TaskB3 {
    public static void main( String[] args ) {
        Scanner sc=new Scanner(System.in);
            int i=sc.nextInt();

            int j=0;
while (j<i){

int sum = ((j+1)*(j+2))/2;
    if(sum>i) break;
    System.out.print(sum + ",");

    j++;




      //      for(int j=0; j<=30; j++){
      //         System.out.print(((j+1)*(j+2))/2+ ",");
      //          if (j>i) break;
      //     }


}}}
