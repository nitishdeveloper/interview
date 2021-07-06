package com.java8.questions;

import java.util.Arrays;

public class MinimizeTheHeights {
    public static void main(String[] args) {

        int arr[] = {1, 5, 8, 10};
        int n = arr.length;
        int k = 2;
        System.out.println(getMinimumDifference(arr, n, k));
    }
    public static int getMinimumDifference(int[] arr, int n, int k) {
        // code here
        if(n == 0) return 0;

        Arrays.sort(arr);

        int min_difference = arr[n-1] - arr[0];
        int min_height = arr[0] + k;
        int max_height = arr[n-1] - k;

        System.out.println("min_height : "+min_height+" max_height: "+max_height);

        for(int i = 0; i < n-1; i++){
            int max = Math.max(max_height , arr[i] + k);
            int min = Math.min(min_height , arr[i+1] - k);
            if(min < 0 ){
                continue;
            }
            min_difference = Math.min(min_difference , max-min);
        }

        return min_difference;

    }
}
