package by.it.sc03_evening_mon_fri.kalita.lesson09;

/*
 * Даны целые числа 1<=n<=1E18 и 2<=m<=1E5,
 * необходимо найти остаток от деления n-го числа Фибоначчи на m.
 * время расчета должно быть не более 2 секунд
 */

import java.math.BigInteger;

public class FiboC1 {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {
        FiboC1 fibo = new FiboC1();
        int n =10;
        int m = 2;
        System.out.printf("fasterC(%d)=%d \n\t time=%d \n\n", n, fibo.fasterC(n, m), fibo.time());
    }

    long fasterC(long n, int m) {
        //решение практически невозможно найти интуитивно
        //вам потребуется дополнительный поиск информации
        //см. период Пизано
        int em = m*5;
        BigInteger[] fib = new BigInteger[em];

        BigInteger[] fib1 = new BigInteger[em];
        fib1[0]=fib[0] = BigInteger.ZERO;
        fib1[1] =  fib[1] = BigInteger.ONE;
        int period = 1;
        boolean flag = true;
        for (int i = 2; i < em; i++) {
            fib[i]=fib[i-1].add(fib[i-2]);
            fib1[i] = fib[i].mod(BigInteger.valueOf(m));
            //System.out.println(i + " " + fib[i] + "  "+fib1[i]);
            if(i>2)
            if(fib1[i-1].compareTo(BigInteger.ZERO)==0&&fib1[i].compareTo(BigInteger.ONE)==0&&flag){
                period = i-1;
                flag = false;
            }
        }
       // System.out.println(period);
       //System.out.println(Math.floorDiv(n,period));
       //System.out.println(n + " - "+Math.floorDiv(n,period)+" * "+period + " = " +(n-Math.floorDiv(n,period)*period));
        n -=Math.floorDiv(n,period)*period;

        return fib1[(int)n].longValue();
    }


}

