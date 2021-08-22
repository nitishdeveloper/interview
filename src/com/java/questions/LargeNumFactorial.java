package com.java.questions;

import java.util.ArrayList;

public class LargeNumFactorial {
    public static void main(String[] args) {

    }

    static ArrayList<Integer> factorialNavieApproch(int N){
        ArrayList<Integer> result = new ArrayList<>();
        if(N <= 1) return result;
        int factorial = 1;
        for(int i = 1; i <= N; i++){
            factorial *= i;
            result.add(factorial);
        }
        return result;
    }

    static int multiply(int x , int arr[] , int size){
        int carry = 0;

        for(int i = 0; i < size; i++){
            int temp = arr[i]  * x + carry;
            arr[i] = temp % 10;
            carry = temp / 10;
        }

        if(carry != 0){
            arr[size] = carry % 10;
            carry /= 10;
            size++;
        }
        return size;

    }

}
