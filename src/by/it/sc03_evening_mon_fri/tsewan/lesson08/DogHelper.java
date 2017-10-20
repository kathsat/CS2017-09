package by.it.sc03_evening_mon_fri.tsewan.lesson08;

public class DogHelper {

   static void printAllNames(Dog[] dogs){
        for (Dog d:dogs)
            System.out.print(d.getName()+" ");
    };

    static double averageAge(Dog[] dogs){
        double sum=0;
        for (Dog d:dogs)
            sum=sum+d.getAge();
        return sum/dogs.length;


    };


}
