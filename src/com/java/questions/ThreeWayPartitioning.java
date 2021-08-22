package com.java.questions;

import java.util.Arrays;


class TheDemo {
    public static void main(String[] args) {
        int[] a = new int[]{14, 20, 5};
        System.out.println("before : " + Arrays.toString(a));

        int n = a.length - 1;
        int temp = a[n];
        int k = n - 1;
        for (int i = n; i > 0; i--) {
            a[i] = a[k];
            k--;
        }
        a[0] = temp;
        System.out.println("After : " + Arrays.toString(a));

    }
}


public class ThreeWayPartitioning {
    public static void main(String[] args) {
        threeWayPartition(new int[]{1, 14, 20, 5, 4, 2, 54}, 14, 20);
    }

    public static void threeWayPartition(int array[], int a, int b) {
        int n = array.length;
        int start = 0, end = n - 1;

        for (int i = 0; i <= end; ) {
            if (array[i] < a) {
                int temp = array[start];
                array[start] = array[i];
                array[i] = temp;
                start++;
                i++;
            } else if (array[i] > b) {
                int temp = array[end];
                array[end] = array[i];
                array[i] = temp;
                end--;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
