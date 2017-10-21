package by.it.sc02_morning.liplianina.lesson08;

public class DogHelper {

    public static void printAllNames (Dog[] dogs) {
        for (Dog x : dogs) System.out.print(x.getName() + " ");
    }

    public static double averageAge(Dog[] dogs) {
        double sumage = 0;
        for (Dog x : dogs) sumage = sumage + (double) x.getAge();
        return sumage / (double) dogs.length;
    }

}
