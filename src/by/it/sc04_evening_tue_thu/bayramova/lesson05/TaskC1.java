package by.it.sc04_evening_tue_thu.bayramova.lesson05;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/

import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        System.out.println("Какую вы хотите зарплату в $$$?");
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        if (salary < 300 || salary > 3000) {
            System.out.println("Мы вам перезвоним!");
        }
        else {
            double salaryMonth;
            int month=0;
            switch(month) {
                case 0:
                    System.out.println("За месяц 0 начислено $0.0");
                case 1:
                    salaryMonth=1.5*salary;
                    System.out.println("За январь начислено $"+salaryMonth);
                    if (salaryMonth==666) break;
                case 2:
                    salaryMonth=1.5*salary;
                    System.out.println("За февраль начислено $"+salaryMonth);
                    if (salaryMonth==666) break;
                case 3:
                    salaryMonth=1.5*salary;
                    System.out.println("За март начислено $"+salaryMonth);
                    if (salaryMonth==666) break;
                case 4:
                    salaryMonth=1.5*salary;
                    System.out.println("За апрель начислено $"+salaryMonth);
                    if (salaryMonth==666) break;
                case 5:
                    salaryMonth=1.5*salary;
                    System.out.println("За май начислено $"+salaryMonth);
                    if (salaryMonth==666) break;
                case 6:
                    salaryMonth=salary;
                    System.out.println("За июнь начислено $"+salaryMonth);
                    if (salaryMonth==666) break;
                case 7:
                    salaryMonth=salary;
                    System.out.println("За июль начислено $"+salaryMonth);
                    if (salaryMonth==666) break;
                case 8:
                    salaryMonth=salary;
                    System.out.println("За август начислено $"+salaryMonth);
                    if (salaryMonth==666) break;
                case 9:
                    salaryMonth=1.5*salary;
                    System.out.println("За сентябрь начислено $"+salaryMonth);
                    if (salaryMonth==666) break;
                case 10:
                    salaryMonth=1.5*salary;
                    System.out.println("За октябрь начислено $"+salaryMonth);
                    if (salaryMonth==666) break;
                case 11:
                    salaryMonth=1.5*salary;
                    System.out.println("За ноябрь начислено $"+salaryMonth);
                    if (salaryMonth==666) break;
                case 12:
                    salaryMonth=1.5*salary;
                    System.out.println("За декабрь начислено $"+salaryMonth);
                    if (salaryMonth==666) break;
                case 13:
                    System.out.println("За месяц 13 начислено $0.0");
                case 14:
                    System.out.println("За месяц 14 начислено $0.0");
            }

        }
    }
}
