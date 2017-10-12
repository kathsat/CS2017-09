package by.it.sc03_evening_mon_fri.mironchik.lesson05;

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
        Scanner sc= new Scanner(System.in);
        double a = sc.nextDouble();

        if(a<300 || a>3000) System.out.println("Мы вам перезвоним!");
        else {
            for(int month=0; month<15; month++) {
                System.out.print("За ");
                switch (month) {
                    case 1:
                        System.out.print("январь");
                        break;
                    case 2:
                        System.out.print("февраль");
                        break;
                    case 3:
                        System.out.print("март");
                        break;
                    case 4:
                        System.out.print("апрель");
                        break;
                    case 5:
                        System.out.print("май");
                        break;
                    case 6:
                        System.out.print("июнь");
                        break;
                    case 7:
                        System.out.print("июль");
                        break;
                    case 8:
                        System.out.print("август");
                        break;
                    case 9:
                        System.out.print("сентябрь");
                        break;
                    case 10:
                        System.out.print("октябрь");
                        break;
                    case 11:
                        System.out.print("ноябрь");
                        break;
                    case 12:
                        System.out.print("декабрь");
                        break;
                        default: System.out.print("месяц "+month);
                }
                System.out.print(" начислено ");
                if (month==0 || month==13 || month==14) System.out.println("$0.0");
                else if (month>5 && month<9) System.out.println(a);
                else System.out.println("$"+1.5*a);
                if(a==666 || 1.5*a==666) break;
            }
        }
    }
}
