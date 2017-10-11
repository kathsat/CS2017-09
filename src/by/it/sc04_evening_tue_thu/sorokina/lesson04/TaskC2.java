package by.it.sc04_evening_tue_thu.sorokina.lesson04;

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




    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(5467));
    }



    static int sumDigitsInNumber(int a){
        return firstNumber(a)+secondNumber(a)+thirdNumber(a)+forthNumber(a);

    }

    static int firstNumber(int a){
        return  a/1000;
    }

    static int secondNumber(int a){
        return (a/100)%10;
    }

    static int thirdNumber(int a){
        return (a/10)%10;
    }

    static int forthNumber(int a){
        return a%10;
    }

}
