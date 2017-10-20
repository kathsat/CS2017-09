package by.it.sc02_morning.patsko.lesson08;

public class DogHelper {
    public static void printAllNames(Dog[] dogs){
        for (int i=0; i<dogs.length;i++) {
            System.out.print(dogs[i].getName()+" ");
        }
    } //должен печатать в консоль через пробел имена всех собак
    public static double averageAge(Dog[] dogs){
        int sum=0;
        for (int i = 0; i < dogs.length; i++) {sum+=dogs[i].getAge();}
        return (double)sum/dogs.length;
    } //должен вычислять средний возраст переданных ему собак

}
