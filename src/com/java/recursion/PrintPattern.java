package com.java.recursion;

public class PrintPattern {
    public static void main(String[] args) {
        pattern(7);
    }

    private static void pattern(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = n - i; j > 1; j--) {
                System.out.print("-");
            }
            for (int p = 0; p <= i; p++) {
                System.out.print("-*-");
            }

            System.out.println();
        }
    }
}
