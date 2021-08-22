package com.java.questions;

import java.util.HashSet;
import java.util.Set;

public class findSum {
    public static void main(String[] args) {
        System.out.println(findSumOptimiseApproch(new int[]{4,2,-3,1,6},5));
    }

    static boolean findSumOptimiseApproch(int arr[],int n){
        if(n == 0) return false;
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(arr[i] == 0 || sum == 0 | set.contains(sum)) return true;
            set.add(sum);
        }
        return false;
    }
}
