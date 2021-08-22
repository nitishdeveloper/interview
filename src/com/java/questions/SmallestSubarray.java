package com.java.questions;

public class SmallestSubarray {
    public static void main(String[] args) {
        System.out.println(sbSlidingWindow(new int[]{1, 4, 45, 6, 0, 19} ,6,51));
    }

    public static int sbTwoPointer(int a[], int n, int x) {
        if(n == 0) return 0;

        int min = Integer.MAX_VALUE;
        int start = 0 , end = 0;
        int sum = 0;

        while(end < n){
            sum += a[end++];
            while(sum > x){
                min = Math.min(min , end-start);
                sum -= a[start++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static int sbSlidingWindow(int a[], int n, int x) {
        if(n == 0) return 0;

        int s = 0 , e = 0;
        int sum = 0;
        int min = n+1;

        while(e < n){
            while(sum <= x && e < n){
                sum += a[e++];
            }
            while(sum > x && s < n){
                min = Math.min(min , e-s);
                sum -= a[s++];
            }
        }
        return min;
    }


}
