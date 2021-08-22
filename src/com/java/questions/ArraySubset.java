package com.java.questions;

import java.util.HashSet;
import java.util.Set;

public class ArraySubset {
    public static void main(String[] args) {
        long a1[] = {10, 5, 2, 23, 19};
        long a2[] = {19, 5, 2};
        System.out.println(isSubset( a1,a2 ,a1.length , a2.length));
    }

    public static String isSubset( long a1[], long a2[], long n, long m) {
        if(n < 1 || m < 1) return "No";


        boolean isMatched = false;
        Set<Long> set = new HashSet<>();
        for(long val : a1){
            set.add(val);
        }

        for(long val2 : a2){
            isMatched = set.contains(val2) ? true : false;
        }

        return isMatched ? "Yes" : "No";

    }
}
