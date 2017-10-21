package by.it.sc04_evening_tue_thu.bayramova.lesson08;

class DogHelper {
    static void printAllNames(Dog[] dogs){
        for (Dog d:dogs) System.out.print(d.getName()+" ");
    }

    static double averageAge(Dog[] dogs){
        double sum=0;
        for (Dog d:dogs) {
            sum+=d.getAge();
        }
        return sum/dogs.length;
    }
}
