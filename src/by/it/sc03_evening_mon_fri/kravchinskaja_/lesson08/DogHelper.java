package by.it.sc03_evening_mon_fri.kravchinskaja_.lesson08;

public class DogHelper {
    static void printAllNames(Dog[] localdogs) {
        for (Dog d : localdogs)
           System.out.print(d.getName() + " ");
System.out.println();
    }
    static double averageAge(Dog[] dogs){
        double sum=0;
        for(Dog d: dogs)
            sum+=d.getAge();
        return sum/dogs.length;


    }
    }
