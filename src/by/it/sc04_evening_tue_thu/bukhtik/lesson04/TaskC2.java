package by.it.sc04_evening_tue_thu.bukhtik.lesson04;
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
public class TaskC2 {

<<<<<<< HEAD
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(5467));

    }

    public static int sumDigitsInNumber(int x) {
        int a = x % 10;
        int b = (x / 10) % 10;
        int c = (x/100) % 10;
        int d = (x/1000) % 10;

        return a + b + c + d;

    }




=======



//    public static void main(String[] args) {
//        System.out.println(sumDigitsInNumber(5467));
//    }
>>>>>>> origin/master

}
