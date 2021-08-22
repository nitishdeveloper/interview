package com.java.questions;

import java.math.BigInteger;
import java.util.ArrayList;

public class FactorialOFLargeNumber {
    public static void main(String[] args) {
        System.out.println(factorialNavieApproch(50));
    }

    static ArrayList<BigInteger> factorialNavieApproch(int N){
        ArrayList<BigInteger> result = new ArrayList<>();
        if(N <= 1) return result;
        BigInteger factorial = new BigInteger("1");
        for(int i = 1; i <= N; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
            result.add(factorial);
        }
        return result;
    }
}
