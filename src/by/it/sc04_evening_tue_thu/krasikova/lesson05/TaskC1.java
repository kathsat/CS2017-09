package by.it.sc04_evening_tue_thu.krasikova.lesson05;

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
    public static void main(String args[]) {
        System.out.println("Какую вы хотите зарплату в $$$?");
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        if (sum < 300 || sum > 3000) {
            System.out.println("Мы вам перезвоним!");
        } else
            done: {
            for (int month = 0; month < 15; month++) {
                double win=(sum+(sum*(0.5)));
                double summer=(sum*1.0);
                switch (month) {
                    case 0:
                        System.out.println("За месяц 0 начислено $0.0");
                        break;
                    case 1:
                        System.out.println("За январь начислено $" + win);
                        if (win==666.0) break done;
                        break;
                    case 2:
                        System.out.println("За февраль начислено $" + win);
                        if (win==666.0) break done;
                        break;
                    case 3:
                        System.out.println("За март начислено $" + win);
                        if (win==666.0) break done;
                        break;
                    case 4:
                        System.out.println("За апрель начислено $" + win);
                        if (win==666.0) break done;
                        break;
                    case 5:
                        System.out.println("За май начислено $" + win);
                        if (win==666.0) break done;
                        break;
                    case 6:
                        System.out.println("За июнь начислено $" + summer);
                        if (summer==666.0) break done;
                        break;
                    case 7:
                        System.out.println("За июль начислено $" + summer);
                        if (summer==666.0) break done;
                        break;
                    case 8:
                        System.out.println("За август начислено $" + summer);
                        if (summer==666.0) break done;
                        break;
                    case 9:
                        System.out.println("За сентябрь начислено $" + win);
                        if (win==666.0) break done;
                        break;
                    case 10:
                        System.out.println("За октябрь начислено $" + win);
                        if (win==666.0) break done;
                        break;
                    case 11:
                        System.out.println("За ноябрь начислено $" + win);
                        if (win==666.0) break done;
                        break;
                    case 12:
                        System.out.println("За декабрь начислено $" + win);
                        if (win==666.0) break done;
                        break;
                    case 13:
                        System.out.println("За месяц 13 начислено $0.0");
                        break;
                    case 14:
                        System.out.println("За месяц 14 начислено $0.0");
                        break;
                    }
                }


            }
        }
    }

