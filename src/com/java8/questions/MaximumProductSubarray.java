package com.java8.questions;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        System.out.println(maxProductOptimalApproch(new int[]{6, -3, -10, 0, 2} , 5));
    }

    static long maxProduct(int[] arr, int n) {
        if(n == 0) return 0;
        long maximum = 1 , product = 1;
        long positive;
        for(int i = 0; i < n-1; i++){
            positive = arr[i] < 0 ? (arr[i] * -1) : arr[i];
            if(positive == 0){
                maximum = Math.max(maximum , product);
                product = 1;
                continue;
            }
            product = product * positive;
        }
        return Math.max(maximum , product);
    }

    static long maxProductOptimalApproch(int[] arr, int n) {
        if(n == 0) return 0;

        long maximum = arr[0];
        long minimum = arr[0];
        long product = arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i] < 0){
                long temp = maximum;
                maximum = minimum;
                minimum = temp;
            }
            maximum = Math.max(arr[i] , maximum * arr[i]);
            minimum = Math.min(arr[i] , minimum * arr[i]);
            product = Math.max(maximum , product);
        }

        return product;
    }
}
