package by.it.sc03_evening_mon_fri.kalita.lesson09;

/*
 * Даны целые числа 1<=n<=1E18 и 2<=m<=1E5,
 * необходимо найти остаток от деления n-го числа Фибоначчи на m.
 * время расчета должно быть не более 2 секунд
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FiboC1 {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {
        FiboC1 fibo = new FiboC1();
        int n =5987456;
        int m = 100000;
        System.out.printf("fasterC(%d)=%d \n\t time=%d \n\n", n, fibo.fasterC(n, m), fibo.time());
    }

    long fasterC(long n, int m) {
        //решение практически невозможно найти интуитивно
        //вам потребуется дополнительный поиск информации
        //см. период Пизано
        int em = m*m+1;


        List<BigInteger> fib2= new ArrayList<BigInteger>();
        List<BigInteger> fib3= new ArrayList<BigInteger>();
        fib3.add(0,BigInteger.ZERO);
        fib2.add(0,BigInteger.ZERO);
        fib3.add(1,BigInteger.ONE);
        fib2.add(1,BigInteger.ONE);
        int period = 1;
        boolean flag = true;
        for (int i = 2; i < em; i++) {
            fib2.add(fib2.get(i-1).add(fib2.get(i-2)));
            fib3.add(fib2.get(i).mod(BigInteger.valueOf(m)));
            //System.out.println(i + " " + fib[i] + "  "+fib1[i]);
            if(i>2)
            if(fib3.get(i-1).compareTo(BigInteger.ZERO)==0&&fib3.get(i).compareTo(BigInteger.ONE)==0){
                period = i-1;
                break;
            }
        }
       // System.out.println(period);
       //System.out.println(Math.floorDiv(n,period));
       //System.out.println(n + " - "+Math.floorDiv(n,period)+" * "+period + " = " +(n-Math.floorDiv(n,period)*period));
        n -=Math.floorDiv(n,period)*period;

        return fib3.get((int)n).longValue();
    }


}

