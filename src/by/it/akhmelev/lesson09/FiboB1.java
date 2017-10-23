package by.it.akhmelev.lesson09;

import java.math.BigInteger;
import java.util.ArrayList;

/*
 * Вам необходимо выполнить способ вычисления чисел Фибоначчи с вспомогательным массивом
 * без ограничений на размер результата (BigInteger)
 */

public class FiboB1 {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {

        //вычисление чисел простым быстрым методом
        FiboB1 fibo = new FiboB1();
        int n = 55555;
        System.out.printf("fastB(%d)=%d \n\t time=%d \n\n", n, fibo.fastB(n), fibo.time());
    }

    BigInteger fastB(int n) {
        //здесь нужно реализовать вариант с временем O(n) и памятью O(n)

        ArrayList<BigInteger> mem = new ArrayList<>();

        if (n == 0)
            return BigInteger.ZERO;
        else mem.add(BigInteger.ZERO);
        if (n == 1)
            return BigInteger.ONE;
        else mem.add(BigInteger.ONE);
        for (int i = 2; i <= n; i++) {
            BigInteger one=mem.get(i-2);
            BigInteger two=mem.get(i-1);
            BigInteger result=one.add(two);
            mem.add(result);
        }
        return mem.get(n);
    }

}

