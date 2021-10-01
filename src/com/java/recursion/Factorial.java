package com.java.recursion;

public class Factorial {
    private static int fact = 1;

    public static void main(String[] args) {
//        System.out.println("result : "+factorial(5));
        factorial1(5);
    }

    private static int factorial(int n) {
        if (n == 1) return n;
        return n * factorial(n - 1);
    }

    private static void factorial1(int n) {
        if (n == 0) return;
        factorial1(n - 1);
        fact *= n;
        System.out.print(fact + " ");
    }
}
