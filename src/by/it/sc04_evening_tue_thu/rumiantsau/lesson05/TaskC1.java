package by.it.sc04_evening_tue_thu.rumiantsau.lesson05;

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
        Scanner sc = new Scanner(System.in);

        System.out.println("Какую вы хотите зарплату в $$$?");

        int salary = sc.nextInt();
        double salaryPlusBonus = salary + salary * 0.5;

        if ((salary < 300) || (salary > 3000))
            System.out.println("Мы вам перезвоним!");
        else {
            String tpLine;

            String tpMonth;
            double tpMonthSalary;

            for (int month = 0; month < 15; month++){

                switch (month) {
                    case 1 : {
                        tpMonth = "январь";
                        tpMonthSalary = salaryPlusBonus;
                        break;
                    }
                    case 2 : {
                        tpMonth = "февраль";
                        tpMonthSalary = salaryPlusBonus;
                        break;
                    }
                    case 3 : {
                        tpMonth = "март";
                        tpMonthSalary = salaryPlusBonus;
                        break;
                    }
                    case 4 : {
                        tpMonth = "апрель";
                        tpMonthSalary = salaryPlusBonus;
                        break;
                    }
                    case 5 : {
                        tpMonth = "май";
                        tpMonthSalary = salaryPlusBonus;
                        break;
                    }
                    case 6 : {
                        tpMonth = "июнь";
                        tpMonthSalary = (double) salary;
                        break;
                    }
                    case 7 : {
                        tpMonth = "июль";
                        tpMonthSalary = (double) salary;
                        break;
                    }
                    case 8 : {
                        tpMonth = "август";
                        tpMonthSalary = (double) salary;
                        break;
                    }
                    case 9 : {
                        tpMonth = "сентябрь";
                        tpMonthSalary = salaryPlusBonus;
                        break;
                    }
                    case 10 : {
                        tpMonth = "октябрь";
                        tpMonthSalary = salaryPlusBonus;
                        break;
                    }
                    case 11 : {
                        tpMonth = "ноябрь";
                        tpMonthSalary = salaryPlusBonus;
                        break;
                    }
                    case 12 : {
                        tpMonth = "декабрь";
                        tpMonthSalary = salaryPlusBonus;
                        break;
                    }
                    default : {
                        tpMonth = "месяц " + month;
                        tpMonthSalary = 0;
                    }
                }

                tpLine = "За " + tpMonth + " начислено $" + tpMonthSalary;
                System.out.println(tpLine);

                if (tpMonthSalary == 666) break;
            }

        }

    }
}
