package by.it.sc04_evening_tue_thu.olgakuchuk.lesson08;

/**
 * Created by Olga on 10/19/17.
 */
public class DogHelper {

    public static void printAllNames(Dog[] dogs) {
        String names="";

        for (Dog dog : dogs) {
           names= names+dog.getName() + " ";
        }

        System.out.println(names);

    }

    public static double averageAge(Dog[] dogs) {
        double result = 0;

        for (Dog dog : dogs) {
            result = result+dog.getAge();

        }


    return result/dogs.length;}


}

