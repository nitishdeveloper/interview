package com.java8.questions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindLongestConseqSubseq {
    public static void main(String[] args) {
        System.out.println(optimalApproch(new int[]{2,6,1,9,4,5,3},7));
    }

    static int niveApproch(int arr[], int N)
    { if(N == 0) return 0;
        Arrays.sort(arr);
        int count = 1 , result = 1;
        for(int i = 1; i < N; i++){
            int diff = arr[i] - arr[i-1];
            if(diff == 0){
                continue;
            }
            if(diff == 1){
                count++;
            }else{
                count  = 1;
            }
            result = Math.max(result , count);
        }

        return result;
    }

    static int optimalApproch(int arr[], int N){
        if(N == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int a : arr){
            set.add(a);
        }
        int longest = 0;
        for(int i = 0; i < N; i++){
            int value = arr[i] - 1;
            if(!set.contains(value)){
                int X = arr[i];
                while(set.contains(X)){
                    X++;
                }
                int condition = X - arr[i];
                longest = Math.max(longest , condition);
            }
        }
        return longest;
        }
}
