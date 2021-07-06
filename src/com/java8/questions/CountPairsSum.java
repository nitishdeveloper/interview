package com.java8.questions;

public class CountPairsSum {
    public static void main(String[] args) {
        System.out.println(getPairsCount(new int[]{1, 5, 7, -1, 5}, 5, 6));
    }
    static int getPairsCount(int[] arr, int n, int k) {
        if(n <= 1) return 0;

        int count = 0;
        int i = 0 , j = 1;

        while(i < n-1){
            int sum = arr[i] + arr[j];
            if(k == sum){
                count++;
            }
            if(j == n-1){
                i++;
                j = i;
            }
            j++;
        }
        return count;
    }
}
