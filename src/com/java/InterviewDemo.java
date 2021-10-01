package com.java;

public class InterviewDemo {
    static int a = 0;
    static int b = 1;
    static int c = 0;

    public static void main(String[] args) {
        fib1(5);
    }


    private static int feb(int n) {
        if (n <= 1) return n;
        return feb(n - 1) + feb(n - 2);
    }

    private static void fib(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 1; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    private static void fib1(int n) {
        if (n > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
            fib1(n - 1);
        }
    }

}
