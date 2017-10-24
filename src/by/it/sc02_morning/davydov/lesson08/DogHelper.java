package by.it.sc02_morning.davydov.lesson08;

public class DogHelper {

    static void printAllNames(Dog[] dogs) {

        for (int i = 0; i < dogs.length; i++) {
            System.out.print (dogs[i].getName() + " ");
        }

    }

    static double averageAge(Dog[] dogs) {
        int summa_w = 0;

        for (int i = 0; i < dogs.length; i++) {
            summa_w = summa_w + dogs[i].getAge();
        }
        return (double) summa_w / dogs.length;



    }




}



//    Создайте новый класс DogHelper и в нем два статических метода
//    void printAllNames(Dog[] dogs){.....}; //должен печатать в консоль через пробел имена всех собак
//double averageAge(Dog[] dogs){.....}; //должен вычислять средний возраст переданных ему собак