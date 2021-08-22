package com.java;

class Demo{

}



public class Test {
    public static void main(String[] args) {
//        long A[] = {1, 2, 3, 4, 5};
//        rotate(A,5);
//        System.out.println(Arrays.toString(A));

        Runnable runnable = () -> System.out.println("test thread class");


        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("Main Thread");
    }

    public static void rotate(long arr[], long n)
    {
        if(n == 0) return;

        int len = arr.length;
        long last_val = arr[len-1];
        long first_val = arr[0];
        arr[0] = last_val;

        for(int i = 1; i < len; i++){
            long next = arr[i];
            arr[i] = first_val;
            first_val = next;
        }
    }
}

