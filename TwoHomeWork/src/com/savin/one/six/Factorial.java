package com.savin.one.six;

import java.math.BigInteger;

public class Factorial {
    private BigInteger num;

    public Factorial(BigInteger num){
        this.num = num;
    }

    public static BigInteger factorial(BigInteger num){
        if (num.equals(BigInteger.ZERO) || num.equals(BigInteger.ONE)){
            return BigInteger.ONE;
        }
        return num.multiply(factorial(num.subtract(BigInteger.ONE)));
    }

    public static BigInteger factorial(int num){
        if (num == 0 || num == 1){
            return BigInteger.ONE;
        }

        BigInteger bigInteger = BigInteger.valueOf(num);
        return bigInteger.multiply(factorial(bigInteger.subtract(BigInteger.ONE)));
    }
}
