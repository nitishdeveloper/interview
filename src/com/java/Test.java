package com.java;

class Demo {
    int value = 10;

    void print() {
        System.out.println("hello1");
    }

    private void print123() {
        System.out.println("hello1");
    }
}

class Demo1 extends Demo {
    int value = 20;

    void print2() {
        System.out.println("hello2");
    }

    private void print123() {
        System.out.println("hello1");
    }

    void print() {
        System.out.println("hello1 demo1");
    }

}


public class Test {
    public static void main(String[] args) {
        Demo demo = new Demo1();
        System.out.println(demo.value);
        demo.print();

        String str1 = new String("nitish");
        String str2 = new String("nitish");
        System.out.println("result : " + str1 == str2);
        //System.out.println("result :"+str1.equals(str2));

    }

//    public static void rotate(long arr[], long n)
//    {
//        if(n == 0) return;
//
//        int len = arr.length;
//        long last_val = arr[len-1];
//        long first_val = arr[0];
//        arr[0] = last_val;
//
//        for(int i = 1; i < len; i++){
//            long next = arr[i];
//            arr[i] = first_val;
//            first_val = next;
//        }
//    }
}

