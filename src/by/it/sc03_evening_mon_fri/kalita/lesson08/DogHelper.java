package by.it.sc03_evening_mon_fri.kalita.lesson08;

import java.lang.reflect.Array;

/**
 * Created by Denis on 20.10.2017.
 */ class DogHelper extends Dog{
    public  static void printAllNames(Dog[] dogs){
        for (Dog str: dogs      ) {
            System.out.print(str.getName()+" ");
        }
        System.out.println();
    }
    public static double averageAge(Dog[] dogs){
        int average = 0;
        for (Dog age:dogs) {
            average +=age.getAge();
        }
        return (double)average/ dogs.length;
    }
}
