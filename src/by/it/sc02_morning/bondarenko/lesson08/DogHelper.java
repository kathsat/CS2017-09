package by.it.sc02_morning.bondarenko.lesson08;

class DogHelper {

    static void printAllNames(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            System.out.printf(dogs[i].getName() + ((i == dogs.length - 1) ? "%n" : " "));
        }
    }

    static double averageAge(Dog[] dogs) {
        double sum = 0;
        for (Dog dog : dogs) {
            sum += dog.getAge();
        }
        return sum / dogs.length;
    }
}