package by.it.sc03_evening_mon_fri.mironchik.lesson03;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3,86
Земля   9,81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)
Требования:
1. Метод getWeight(int) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
import java.util.Scanner;
class TaskC3 {
    public static double getWeight(int a) {
        double w =a*3.86/9.81;
        double w1=Math.round(w * 100.0) / 100.0;
        return w1;
    }
    public static void main(String[] args) {
        System.out.println("Введите массу человека в кг: ");
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        System.out.println(getWeight(m));
    }

}
