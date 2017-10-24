package by.it.sc04_evening_tue_thu.gimzhevsky.lesson08;

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
        Dog dog1 = new Dog();
        dog1.setName("Шарик");
        dog1.setAge(1);
        Dog dog2 = new Dog();
        dog2.setName("Жучка");
        dog2.setAge(2);
        Dog dog3 = new Dog();
        dog3.setName("Бобик");
        dog3.setAge(3);
        Dog dog4 = new Dog();
        dog4.setName("Барбос");
        dog4.setAge(4);
        Dog dog5 = new Dog();
        dog5.setName("Полкан");
        dog5.setAge(5);
        Dog[] dogs = new Dog[5];
        dogs[0] = dog1;
        dogs[1] = dog2;
        dogs[2] = dog3;
        dogs[3] = dog4;
        dogs[4] = dog5;
        /*DogHelper dh = new DogHelper();
        dh.printAllNames(dogs);
        System.out.println(dh.averageAge(dogs));
        */
        DogHelper.printAllNames(dogs);
        System.out.println(DogHelper.averageAge(dogs));
    }


}
