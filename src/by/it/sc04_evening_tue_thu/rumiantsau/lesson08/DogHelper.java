package by.it.sc04_evening_tue_thu.rumiantsau.lesson08;

public class DogHelper {
    static void printAllNames(Dog[] dogs) {
        String outString = "";
        for (int i = 0; i < dogs.length; i ++) {
            outString = outString + dogs[i].getName();
            if (i != dogs.length - 1) {
                outString = outString + " ";
            };
        }
        System.out.println(outString);
    }

    static double averageAge(Dog[] dogs) {
        int totalAge = 0;
        for (int i = 0; i < dogs.length; i++){
            totalAge = totalAge + dogs[i].getAge();
        }
        return (double) totalAge / dogs.length;
    }
}
