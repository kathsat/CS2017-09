package by.it.sc04_evening_tue_thu.gimzhevsky.lesson08;

public class DogHelper {
    public static void printAllNames(Dog[] dogs){
        String result = "";
        for (int i = 0; i<dogs.length; i++){
            result = result + dogs[i].getName() + " ";
        }
        System.out.println(result);
    }
    public static double averageAge(Dog[] dogs){
        double age = 0;
        for (int i = 0; i<dogs.length; i++){
            age = age + dogs[i].getAge();
        }
        double avAge = age/(dogs.length);
        return avAge;
    }
}
