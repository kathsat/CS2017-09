package by.it.sc04_evening_tue_thu.rumiantsau.lesson08;

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
        Dog[] dogs = new Dog[5];

        String tpDogName = "";

        for (int i = 0; i < dogs.length; i++){
            dogs[i] = new Dog();
            switch (i) {
                case 0 : {
                    tpDogName = "Шарик";
                    break;
                }
                case 1 : {
                    tpDogName = "Жучка";
                    break;
                }
                case 2 : {
                    tpDogName = "Бобик";
                    break;
                }
                case 3 : {
                    tpDogName = "Барбос";
                    break;
                }
                case 4 : {
                    tpDogName = "Полкан";
                    break;
                }
            }
            dogs[i].setName(tpDogName);
            dogs[i].setAge(i + 1);
        }

        DogHelper.printAllNames(dogs);
        System.out.println(DogHelper.averageAge(dogs));
    }
}
