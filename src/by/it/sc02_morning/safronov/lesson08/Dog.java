package by.it.sc02_morning.safronov.lesson08;

public class Dog extends  Object {
    private String name;
    private  int age;
    private int weight;
    private double power;

    static int count;
    public Dog(){
    count++;}

    public String getName() {
        return name;
    }
    public void setName(String name) {this.name = name;}

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }
    public void setPower(double power) {
        this.power = power;
    }


        public String toString() {
        return "Кличка: "+getName()+". Возраст: "+getAge();}

        boolean win (Dog otherDog){
       return  0.2 * this.getAge() + 0.3 * this.getWeight() + 0.5 * this.getPower() > 0.2 * otherDog.getAge() + 0.3 *otherDog.getWeight() + 0.5 * otherDog.getPower();
   }
}
//2) Напишите экземплярный метод в классе Dog
//        boolean win(Dog otherDog)
//        {... тело метода...}
//        который рассчитывает, кто из двух собак победит эта (this) или та (otherDog).
//
//        Расчет должен быть таким.
//        Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.
//
//        Побеждает та собака, у которой больше шансов на победу.
//        Если победила эта (this), то метод win возвращает true, иначе false
