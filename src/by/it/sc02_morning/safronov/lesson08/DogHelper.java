package by.it.sc02_morning.safronov.lesson08;

public class DogHelper {

    static void printAllNames(Dog[] dogs) {
        int i;
        for (i = 0; i < dogs.length; i++) {
            System.out.print(dogs[i].getName() + " ");
        }
        System.out.println();
    }


    static double averageAge(Dog[] dogs) {
        int i;
        double averAge = 0;
        for (i = 0; i < dogs.length; i++) {
            averAge = averAge + dogs[i].getAge();
        }
        return averAge / dogs.length;
    }


}



/*

B. (продолжение задач уровня А).

Создайте новый класс DogHelper и в нем два статических метода
void printAllNames(Dog[] dogs){.....}; //должен печатать в консоль через пробел имена всех собак
double averageAge(Dog[] dogs){.....}; //должен вычислять средний возраст переданных ему собак

В классе TaskB1 и его методе main
    Создайте массив из 5 разных собак. Дайте всем клички и укажите возраст.
    Шарик 1 год, Жучка 2 года, Бобик 3 года, Барбос 4 года, Полкан 5 лет

    Напечатайте их имена с помощью метода printAllNames, ожидается
    Шарик Жучка Бобик Барбос Полкан

    Напечатайте с новой строки их средний возраст,
    рассчитанный через метод averageAge, ожидается:
    3.0

Итого, правильный вывод такой:
Шарик Жучка Бобик Барбос Полкан
3.0

*/