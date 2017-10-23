package by.it.sc03_evening_mon_fri.mironchik.lesson08;

class DogHelper {
    static void printAllNames(Dog[] dogs){
        for (int i=0;i< dogs.length;i++) {
            System.out.print(dogs[i].getName()+" ");
        }
    }
    static double averageAge(Dog[] dogs) {
        double av=0;
        for (int i=0;i< dogs.length;i++) {
            av+=dogs[i].getAge();
        }
        return av/dogs.length;
    }
}
