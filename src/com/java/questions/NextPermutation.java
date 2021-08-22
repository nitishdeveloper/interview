package com.java.questions;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        nextPermutation(new int[]{1,1,5,4,1});
    }

    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        while(i >= 0 && nums[i+1] <= nums[i]){
            i--;
        }

        if(i >= 0){
            int j = nums.length - 1;

            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums , i , j);
        }
        reverse(nums , i+1);

        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] nums , int start){
        int i = start; int j = nums.length - 1;
        while(i < j){
            swap(nums , i , j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums , int start , int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
