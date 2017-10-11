package by.it.sc02_morning.patsko.lesson05;

import java.util.Scanner;

/*
На входе вводится число и месяц 2017 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte day=sc.nextByte();
        byte month=sc.nextByte();
        int number=0,i=1;
        while(i<month) {
            switch (i) {
                case 1: number+=31; i++; break;
                case 2: number+=28; i++; break;
                case 3: number+=31; i++; break;
                case 4: number+=30; i++; break;
                case 5: number+=31; i++; break;
                case 6: number+=30; i++; break;
                case 7: number+=31; i++; break;
                case 8: number+=31; i++; break;
                case 9: number+=30; i++; break;
                case 10:number+=31; i++; break;
                case 11:number+=30; i++; break;
            }
        }
        System.out.println(number+day);
    }
}
