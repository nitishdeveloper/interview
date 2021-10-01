package com.java.questions;

public class FindMissingNumber {
    public static void main(String[] args) {
//        System.out.println(missingNumber2(new int[]{1, 2, 4, 5, 6},5));

        System.out.println(missingNumber3(new int[]{4, 5, 7, 8, 9}, 5));
    }

    private static int missingNumber1(int[] a, int n) {
        int total = (n + 1) * (n + 2) / 2;
        for (int i = 0; i < n; i++) {
            total -= a[i];
        }
        return total;
    }

    private static int missingNumber2(int[] a, int n) {
        int x1 = a[0];
        int x2 = 1;
        for (int i = 1; i < n; i++) {
            x1 = x1 ^ a[i];
        }
        for (int i = 2; i <= n + 1; i++) {
            x2 = x2 ^ i;
        }
        return x1 ^ x2;
    }

    private static int missingNumber3(int[] a, int n) {

        for (int i = 0; i < n; i++) {
            int diff = a[i + 1] - a[i];
            if (diff != 1) {
                return a[i] + 1;
            }
        }
        return 0;
    }

}
