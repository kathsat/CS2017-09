package by.it.akhmelev.lesson08;

public class DogHelper {
    static double averageAge(Dog[] dogs){
        double average=0;
        for (Dog dog : dogs) {
            average+=dog.getAge();
        }
        return average/dogs.length;
    }

   static void printAllNames(Dog[] dogs){
        for (Dog dog : dogs) {
            System.out.print(dog.getName()+" ");
        }
    }
}
