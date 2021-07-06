package com.java8.questions;

public class TripletSumArray {
    public static void main(String[] args) {
        System.out.println(twoPointer(new int[]{1,4,45,6,10,8}, 6, 13));
    }
    public static boolean twoPointer(int A[], int n, int X) {

        if(n == 0) return false;

        int s = 0 , e = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int final_sum = 0;

        while(e < n){
            sum += A[e++];
            while(sum > X){
                sum -= A[e-s];
                min = Math.min(min , sum);
                final_sum += min;

                s++;
            }
            if(final_sum == X){
                return true;
            }
        }
        return false;
    }
}
