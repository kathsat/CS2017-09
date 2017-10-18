package by.it.akhmelev.lesson08;

/*

Продолжение задач уровня А.

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

public class TaskB1 {
    public static void main(String[] args) {
        Dog[] d=new Dog[5];
        d[0]=new Dog(); d[0].setName("Шарик");  d[0].setAge(1);
        d[1]=new Dog(); d[1].setName("Жучка");  d[1].setAge(2);
        d[2]=new Dog(); d[2].setName("Бобик");  d[2].setAge(3);
        d[3]=new Dog(); d[3].setName("Барбос"); d[3].setAge(4);
        d[4]=new Dog(); d[4].setName("Полкан"); d[4].setAge(5);
        DogHelper.printAllNames(d);
        System.out.println();
        System.out.println(DogHelper.averageAge(d));
    }
}
