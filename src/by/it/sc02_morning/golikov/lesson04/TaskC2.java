package by.it.sc02_morning.golikov.lesson04;
/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
import java.util.Scanner;
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sumNumb = sumDigitsInNumber(number);
        System.out.println(sumNumb);

    }

    public static int sumDigitsInNumber(int number) {
        int sumNumb = 0;
        for (int i = 0; i < 4; i++) {
            int newNumb = number % 10;
            number = number / 10;
            sumNumb = sumNumb + newNumb;
        }
        return sumNumb;
    }





//    public static void main(String[] args) {
//        System.out.println(sumDigitsInNumber(5467));
//    }

}
