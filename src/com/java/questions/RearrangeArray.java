package com.java.questions;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        rearrangeArrayAlternative1(new int[]{ 2, 3, -4, -1, 6, -9 });
    }
    private static void rearrangeArrayAlternative1(int A[]){
        int len = A.length;
        int negative = 0;
        int positive = 0;

        Arrays.sort(A);
        System.out.println("Sort : "+Arrays.toString(A));
        for (int j : A) {
            if (j >= 0) {
                positive++;
            } else {
                negative++;
            }
        }
        int pos = negative;
        for(int i = 1; i < len; i+=2){
             if(i < negative){
                 int temp = A[i];
                 A[i] = A[pos];
                 A[pos] = temp;
                 pos += 1;
             }
        }

        System.out.println("Result : "+Arrays.toString(A));
    }
}
