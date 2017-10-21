package by.it.sc04_evening_tue_thu.runec.lesson08;

public class DogHelper {
    static void printAllNames(Dog[] dogs){
        for (Dog dog:dogs) {
            System.out.print(dog.getName() + " ");
        }
    }

    static double averageAge(Dog[] dogs){
        int sum=0;
        for (int i = 0; i <dogs.length ; i++) {
            sum=sum+dogs[i].getAge();
        }
        return (double) sum/dogs.length;

    }
}