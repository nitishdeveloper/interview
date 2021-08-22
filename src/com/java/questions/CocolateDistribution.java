package com.java.questions;

import java.util.Arrays;

public class CocolateDistribution {
    public static void main(String[] args) {
        System.out.println(findMinDiff(new int[]{3, 4, 1, 9, 56, 7, 9, 12},8,5));
    }


    public static long findMinDiff(int[] a, int n, int m)
    {
        if(n < m || n == 0 || m == 0) return 0;

        Arrays.sort(a);

        int minimum = Integer.MAX_VALUE;

        for(int i = 0; i+m-1 < n; i++){
            System.out.println("val : "+(i+m-1));
            int difference = a[i+m-1] - a[i];
            minimum = Math.min(difference , minimum);
        }
        return minimum;
    }
}
