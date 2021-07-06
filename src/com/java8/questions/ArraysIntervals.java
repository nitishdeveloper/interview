package com.java8.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysIntervals {
    public static void main(String[] args) {
        merge(new int[][]{{1,4},{0,4}});
    }

    public static void merge(int[][] intervals) {
        int len = intervals.length;
        if(len <= 1) return;
        Arrays.sort(intervals , Comparator.comparingInt(a -> a[0]));
        List<int[]> result = new ArrayList<>();
        int[] current_interval = intervals[0];
        result.add(current_interval);

        for(int[] interval : intervals){
            int start   = current_interval[1];
            int end = interval[0];
            int last = interval[1];
            if(start >= end){
                current_interval[1] = Math.max(start ,last);
            }else{
                current_interval = interval;
                result.add(current_interval);
            }
        }
        System.out.println(Arrays.deepToString(result.toArray(new int[result.size()][])));
    }
}
