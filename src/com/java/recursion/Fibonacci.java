package com.java.recursion;

public class Fibonacci {


    public static void main(String[] args) {
        fibonacci1(5);
    }

    private static int fibonacci(int n) {
        if (n == 1 || n == 0) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static int a = 0;
    private static int b = 1;

    private static void fibonacci1(int n) {
        if (n == 1 || n == 0) return;

        int c = a + b;
        a = b;
        b = c;
        System.out.print(c + " ");
        fibonacci1(n - 1);
    }


}
