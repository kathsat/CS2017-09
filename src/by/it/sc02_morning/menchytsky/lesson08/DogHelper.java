package by.it.sc02_morning.menchytsky.lesson08;

public class DogHelper {

    static void printAllNames(Dog[] dogs) {
        int i;
        for (i = 0; i < dogs.length; i++) {
            System.out.print(dogs[i].getName()+" ");
        }
    }

    static double averageAge(Dog[] dogs){  //должен вычислять средний возраст переданных ему собак
        int i;
        double averAge=0;
        for(i=0; i<dogs.length; i++){
            averAge=averAge+dogs[i].getAge();
    }
    return averAge/dogs.length;
    }
}
