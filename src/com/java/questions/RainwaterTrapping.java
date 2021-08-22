package com.java.questions;

import java.util.Arrays;

public class RainwaterTrapping {
    public static void main(String[] args) {
        System.out.println(bruteForceApproch(new int[]{3,0,0,2,0,4},6));
    }

    private static int bruteForceApproch(int arr[], int n){
        if(n == 0) return 0;

        int [] left = new int[n];
        int [] right = new int[n];
        int res = 0;
        left[0] = arr[0];
        for(int i = 1 ; i < n; i++){
            left[i] = Math.max(left[i - 1],arr[i]);
        }
        right[n-1] = arr[n - 1];
        for(int j = n-2 ; j >= 0; j--){
            right[j] = Math.max(right[j + 1] , arr[j]);
        }

        for(int l = 0; l < n; l++){
            res += Math.min(left[l] ,right[l]) - arr[l];
        }

        System.out.println("array : "+Arrays.toString(arr)+"\nleft : "+Arrays.toString(left)+"\nright :"+Arrays.toString(right));

        return res;
    }


    private static int twoPointerTechnique(int arr[], int n) {
        if(n == 0) return 0;

        int left = 0 , right = n -1;
        int left_max_bar = 0 , right_max_bar = 0;
        int res = 0;

        while(left < right){
            if(arr[left] >= arr[right]){
                if(right_max_bar > arr[right]){
                    res += right_max_bar - arr[right];
                }
                else{
                    right_max_bar = arr[right];
                }
                right--;
            }else{
                if(left_max_bar > arr[left]){
                    res += left_max_bar - arr[left];
                }
                else{
                    left_max_bar = arr[left];
                }
                left++;
            }
        }
        return res;
    }
}
