package by.it.sc02_morning.opanovich.lesson08;

class DogHelper {

    static void printAllNames(Dog[] dogs){
        for (Dog dog : dogs) {
            System.out.print(dog.getName() + " ");
        }
        System.out.println("\b");
    }

    static double averageAge(Dog[] dogs){
        double average = 0;
        for (Dog dog: dogs) {
            average += dog.getAge();
        }
        return average / dogs.length;
    }
}
