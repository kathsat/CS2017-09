package by.it.sc03_evening_mon_fri.mironchik.lesson08;

/*
    toString() для класса Dog

    Доработайте class Dog из задания A1. Создайте в классе Dog метод
    public String toString(){
        //метод должен вернуть строку экземляра класса в виде форматированной строки
        //Пример:
        Кличка: Шарик. Возраст: 5
    }

    Требования:
    1. Программа не должна считывать данные с клавиатуры.
    2. Создайте внутри метода main (класса TaskA2) две разных собаки (т.е. два объекта типа Dog)
    3. Заполните поля собак используя сеттеры.
    4. Первая - Шарик, 5 лет. Вторая - Тузик, 3 года.
    5. Напечатайте этих двух собак, выводите собак как объект без геттеров.

Обратите внимание на точки и пробелы.
Ожидается вывод:
Кличка: Шарик. Возраст: 5
Кличка: Тузик. Возраст: 3


*/
class Dog {
    String name;
    int age;
    private int weight; //вес собаки
    private double power; //сила укуса собаки

    public String getName() {
        return name;
    }
    public void setName (String name) {
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public void setAge (int age) {
        this.age=age;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight (int weight) {
        this.weight=weight;
    }
    public double getPower() {
        return power;
    }
    public void setPower (double power) {
        this.power=power;
    }

    public String toString() {
        String s="Кличка: "+name+". Возраст: "+age;
        return s;
    }
    boolean win(Dog otherDog)
    {
        return 0.2 * this.getAge() + 0.3 * this.getWeight() + 0.5 * this.getPower()>0.2 * otherDog.getAge() + 0.3 * otherDog.getWeight() + 0.5 * otherDog.getPower();
    }
    public Dog() {
    }

    public Dog(String name, int age, int weight, int power) {
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.power=power;
    }
}
