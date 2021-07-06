package com.java8.questions;

import java.util.Arrays;

public class MimimumJump {
    public static void main(String[] args) {
        int arr[] = {2 ,3 ,1 ,1 ,2 ,4 ,2 ,0 ,1 ,1};
        System.out.println(minJumps(arr));
    }

    public static int minJumps(int[] arr){
        int len = arr.length;
        if(len == 0) return 0;

        int jump = 0;
        int value = arr[0];
        int start = 0;
        while(start <= value){
            if(value == start){
                if(start < len) {
                    value = arr[start];
                    start += 1;
                    jump++;
                    System.out.println("jump : " + jump + " , value : " + arr[start] + ", start : " + start);
                }
            }
            start++;
        }

        return jump;
    }
}
