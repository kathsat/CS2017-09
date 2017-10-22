package by.it.sc02_morning.lutskevichm.lesson08;

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
        Dog d1=new Dog();
        Dog d2=new Dog();
        Dog d3=new Dog();
        Dog d4=new Dog();
        Dog d5=new Dog();
        Dog[] dogs = {d1, d2, d3, d4, d5};
        dogs[0].setName("Шарик");
        dogs[1].setName("Жучка");
        dogs[2].setName("Бобик");
        dogs[3].setName("Барбос");
        dogs[4].setName("Полкан");
        dogs[0].setAge(1);
        dogs[1].setAge(2);
        dogs[2].setAge(3);
        dogs[3].setAge(4);
        dogs[4].setAge(5);
        DogHelper.printAllNames(dogs);
        System.out.println();
        System.out.println(DogHelper.averageAge(dogs));

    }
}
