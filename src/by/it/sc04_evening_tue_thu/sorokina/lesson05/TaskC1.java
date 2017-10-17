package by.it.sc04_evening_tue_thu.sorokina.lesson05;

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
    public static void main( String[] args ) {
        System.out.println("Какую вы хотите зарплату в $$$?");
        Scanner sc=new Scanner(System.in);
            double salary=sc.nextInt();
            int monthNumber;
String monthName = " ";




            if(salary<=300 || salary>=3000){
                System.out.println("Мы вам перезвоним!");
            }
            else {
                for(monthNumber=0;monthNumber<14;monthNumber++){

                    switch (monthNumber){
                        case 0:
                            monthName = "месяц " + monthNumber;

                            System.out.println("За " + monthName + " начислено $0.0");
                        case 1:
                            monthName = "январь";
                            System.out.println("За " + monthName + " начислено $" + salary*1.5);
                            if(salary*1.5==666){
                                break;
                            }
                        case 2:
                            monthName = "февраль";
                            System.out.println("За " + monthName + " начислено $" + salary*1.5);

                        case 3:
                            monthName = "март";
                            System.out.println("За " + monthName + " начислено $" + salary*1.5);

                        case 4:
                            monthName = "апрель";
                            System.out.println("За " + monthName + " начислено $" + salary*1.5);

                        case 5:
                            monthName = "май";
                            System.out.println("За " + monthName + " начислено $" + salary*1.5);

                        case 6:
                            monthName = "июнь";
                            System.out.println("За " + monthName + " начислено $" + salary);
                            if(salary==666)break;
                        case 7:
                            monthName = "июль";
                            System.out.println("За " + monthName + " начислено $" + salary);

                        case 8:
                            monthName = "август";
                            System.out.println("За " + monthName + " начислено $" + salary);

                        case 9:
                            monthName = "сентябрь";
                            System.out.println("За " + monthName + " начислено $" + salary*1.5);
                            if(salary==666){
                                break;
                            }
                        case 10:
                            monthName = "октябрь";
                            System.out.println("За " + monthName + " начислено $" + salary*1.5);
                            if(salary==666){
                                break;
                            }
                        case 11:
                            monthName = "ноябрь";
                            System.out.println("За " + monthName + " начислено $" + salary*1.5);
                            if(salary==666){
                                break;
                            }
                        case 12:
                            monthName = "декабрь";
                            System.out.println("За " + monthName + " начислено $" + salary*1.5);
                            if(salary==666){
                                break;
                            }
                        case 13:
                            monthName = "месяц 13";

                            System.out.println("За " + monthName + " начислено $0.0");
                            if(salary==666){
                                break;
                            }
                        case 14:
                            monthName = "месяц 14";

                            System.out.println("За " + monthName + " начислено $0.0");
                            if(salary==666){
                                break;
                            }
                    }

                    break;

              //   if(monthNumber==0){
               //      monthName="месяц 0";

                 }

                }

            }
   /*             for(int month = 1;month>=14;month++){


                    if(month==0 || month==13 || month==14) {
                        switch (month){
                            case 0:
                                System.out.println("За месяц 0 начислено $0.0");
                                break;
                            case 13:
                                System.out.println("За месяц 13 начислено $0.0");
                                break;
                            case 14:
                                System.out.println("За месяц 14 начислено $0.0");
                                break;
                        }

                    }

                    else if(month==6 || month==7 || month==8){
                        switch (month){
                            case 6:
                                System.out.println("За месяц июнь начислено $0.0");
                                break;
                            case 7:
                                System.out.println("За месяц июль начислено $0.0");
                                break;
                            case 8:
                                System.out.println("За месяц август начислено $0.0");
                                break;
                        }
                    }
                        else{
                        salary = salary*1.5;
                        switch (month){
                            case 1:
                                System.out.println("За месяц январь начислено $0.0");
                                break;
                            case 2:
                                System.out.println("За месяц февраль начислено $0.0");
                                break;
                            case 3:
                                System.out.println("За месяц март начислено $0.0");
                                break;
                            case 4:
                                System.out.println("За месяц апрель начислено $0.0");
                                break;
                            case 5:
                                System.out.println("За месяц май начислено $0.0");
                                break;
                            case 9:
                                System.out.println("За месяц сентябрь начислено $0.0");
                                break;
                            case 10:
                                System.out.println("За месяц октябрь начислено $0.0");
                                break;
                            case 11:
                                System.out.println("За месяц ноябрь начислено $0.0");
                                break;
                            case 12:
                                System.out.println("За месяц декабрь начислено $0.0");
                                break;



                        }
                    }
                }
                */

    }


