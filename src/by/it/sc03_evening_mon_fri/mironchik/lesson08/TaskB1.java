package by.it.sc03_evening_mon_fri.mironchik.lesson08;


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



public class TaskB1 {
    public static void main(String[] args) {
        Dog d[]=new Dog[5];
        d[0]=new Dog("Шарик", 1,0,0);
        d[1]=new Dog("Жучка",2,0,0);
        d[2]=new Dog("Бобик",3,0,0);
        d[3]=new Dog("Барбос",4,0,0);
        d[4]=new Dog("Полкан",5,0,0);
        DogHelper.printAllNames(d);
        System.out.println();
        System.out.println(DogHelper.averageAge(d));
    }
}
